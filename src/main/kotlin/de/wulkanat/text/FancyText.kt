package de.wulkanat.text

object TextMap {
    private val base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789`!@#\$%^&*()_+-=~[]{};:'\"\\|,<.>/?"
    private val special: List<Pair<String, String>> = listOf(
        Pair(
            "tiny capital",
            "ABCDEFGHIJKLMNOPQRSTUVWXYZᴀʙᴄᴅᴇꜰɢʜɪᴊᴋʟᴍɴᴏᴘQʀꜱᴛᴜᴠᴡxʏᴢ0123456789`!@#\$%^&*()_+-=~[]{};:'\"\\|,<.>/?"
        ),
        Pair(
            "mono",
            "\uD835\uDE70\uD835\uDE71\uD835\uDE72\uD835\uDE73\uD835\uDE74\uD835\uDE75\uD835\uDE76\uD835\uDE77\uD835\uDE78\uD835\uDE79\uD835\uDE7A\uD835\uDE7B\uD835\uDE7C\uD835\uDE7D\uD835\uDE7E\uD835\uDE7F\uD835\uDE80\uD835\uDE81\uD835\uDE82\uD835\uDE83\uD835\uDE84\uD835\uDE85\uD835\uDE86\uD835\uDE87\uD835\uDE88\uD835\uDE89\uD835\uDE8A\uD835\uDE8B\uD835\uDE8C\uD835\uDE8D\uD835\uDE8E\uD835\uDE8F\uD835\uDE90\uD835\uDE91\uD835\uDE92\uD835\uDE93\uD835\uDE94\uD835\uDE95\uD835\uDE96\uD835\uDE97\uD835\uDE98\uD835\uDE99\uD835\uDE9A\uD835\uDE9B\uD835\uDE9C\uD835\uDE9D\uD835\uDE9E\uD835\uDE9F\uD835\uDEA0\uD835\uDEA1\uD835\uDEA2\uD835\uDEA3\uD835\uDFF6\uD835\uDFF7\uD835\uDFF8\uD835\uDFF9\uD835\uDFFA\uD835\uDFFB\uD835\uDFFC\uD835\uDFFD\uD835\uDFFE\uD835\uDFFF`!@#\$%^&*()_+-=~[]{};:'\"\\|,<.>/?"
        ),
        Pair(
            "italic bold",
            "\uD835\uDE3C\uD835\uDE3D\uD835\uDE3E\uD835\uDE3F\uD835\uDE40\uD835\uDE41\uD835\uDE42\uD835\uDE43\uD835\uDE44\uD835\uDE45\uD835\uDE46\uD835\uDE47\uD835\uDE48\uD835\uDE49\uD835\uDE4A\uD835\uDE4B\uD835\uDE4C\uD835\uDE4D\uD835\uDE4E\uD835\uDE4F\uD835\uDE50\uD835\uDE51\uD835\uDE52\uD835\uDE53\uD835\uDE54\uD835\uDE55\uD835\uDE56\uD835\uDE57\uD835\uDE58\uD835\uDE59\uD835\uDE5A\uD835\uDE5B\uD835\uDE5C\uD835\uDE5D\uD835\uDE5E\uD835\uDE5F\uD835\uDE60\uD835\uDE61\uD835\uDE62\uD835\uDE63\uD835\uDE64\uD835\uDE65\uD835\uDE66\uD835\uDE67\uD835\uDE68\uD835\uDE69\uD835\uDE6A\uD835\uDE6B\uD835\uDE6C\uD835\uDE6D\uD835\uDE6E\uD835\uDE6F0123456789`!@#\$%^&*()_+-=~[]{};:'\"\\|,<.>/?"
        ),
        Pair(
            "italic",
            "\uD835\uDE08\uD835\uDE09\uD835\uDE0A\uD835\uDE0B\uD835\uDE0C\uD835\uDE0D\uD835\uDE0E\uD835\uDE0F\uD835\uDE10\uD835\uDE11\uD835\uDE12\uD835\uDE13\uD835\uDE14\uD835\uDE15\uD835\uDE16\uD835\uDE17\uD835\uDE18\uD835\uDE19\uD835\uDE1A\uD835\uDE1B\uD835\uDE1C\uD835\uDE1D\uD835\uDE1E\uD835\uDE1F\uD835\uDE20\uD835\uDE21\uD835\uDE22\uD835\uDE23\uD835\uDE24\uD835\uDE25\uD835\uDE26\uD835\uDE27\uD835\uDE28\uD835\uDE29\uD835\uDE2A\uD835\uDE2B\uD835\uDE2C\uD835\uDE2D\uD835\uDE2E\uD835\uDE2F\uD835\uDE30\uD835\uDE31\uD835\uDE32\uD835\uDE33\uD835\uDE34\uD835\uDE35\uD835\uDE36\uD835\uDE37\uD835\uDE38\uD835\uDE39\uD835\uDE3A\uD835\uDE3B0123456789`!@#\$%^&*()_+-=~[]{};:'\"\\|,<.>/?"
        ),
        Pair(
            "serif bold",
            "\uD835\uDC00\uD835\uDC01\uD835\uDC02\uD835\uDC03\uD835\uDC04\uD835\uDC05\uD835\uDC06\uD835\uDC07\uD835\uDC08\uD835\uDC09\uD835\uDC0A\uD835\uDC0B\uD835\uDC0C\uD835\uDC0D\uD835\uDC0E\uD835\uDC0F\uD835\uDC10\uD835\uDC11\uD835\uDC12\uD835\uDC13\uD835\uDC14\uD835\uDC15\uD835\uDC16\uD835\uDC17\uD835\uDC18\uD835\uDC19\uD835\uDC1A\uD835\uDC1B\uD835\uDC1C\uD835\uDC1D\uD835\uDC1E\uD835\uDC1F\uD835\uDC20\uD835\uDC21\uD835\uDC22\uD835\uDC23\uD835\uDC24\uD835\uDC25\uD835\uDC26\uD835\uDC27\uD835\uDC28\uD835\uDC29\uD835\uDC2A\uD835\uDC2B\uD835\uDC2C\uD835\uDC2D\uD835\uDC2E\uD835\uDC2F\uD835\uDC30\uD835\uDC31\uD835\uDC32\uD835\uDC33\uD835\uDFCE\uD835\uDFCF\uD835\uDFD0\uD835\uDFD1\uD835\uDFD2\uD835\uDFD3\uD835\uDFD4\uD835\uDFD5\uD835\uDFD6\uD835\uDFD7`!@#\$%^&*()_+-=~[]{};:'\"\\|,<.>/?"
        ),
        Pair(
            "bold",
            "\uD835\uDDD4\uD835\uDDD5\uD835\uDDD6\uD835\uDDD7\uD835\uDDD8\uD835\uDDD9\uD835\uDDDA\uD835\uDDDB\uD835\uDDDC\uD835\uDDDD\uD835\uDDDE\uD835\uDDDF\uD835\uDDE0\uD835\uDDE1\uD835\uDDE2\uD835\uDDE3\uD835\uDDE4\uD835\uDDE5\uD835\uDDE6\uD835\uDDE7\uD835\uDDE8\uD835\uDDE9\uD835\uDDEA\uD835\uDDEB\uD835\uDDEC\uD835\uDDED\uD835\uDDEE\uD835\uDDEF\uD835\uDDF0\uD835\uDDF1\uD835\uDDF2\uD835\uDDF3\uD835\uDDF4\uD835\uDDF5\uD835\uDDF6\uD835\uDDF7\uD835\uDDF8\uD835\uDDF9\uD835\uDDFA\uD835\uDDFB\uD835\uDDFC\uD835\uDDFD\uD835\uDDFE\uD835\uDDFF\uD835\uDE00\uD835\uDE01\uD835\uDE02\uD835\uDE03\uD835\uDE04\uD835\uDE05\uD835\uDE06\uD835\uDE07\uD835\uDFEC\uD835\uDFED\uD835\uDFEE\uD835\uDFEF\uD835\uDFF0\uD835\uDFF1\uD835\uDFF2\uD835\uDFF3\uD835\uDFF4\uD835\uDFF5`!@#\$%^&*()_+-=~[]{};:'\"\\|,<.>/?"
        ),
        Pair(
            "double stroked",
            "\uD835\uDD38\uD835\uDD39ℂ\uD835\uDD3B\uD835\uDD3C\uD835\uDD3D\uD835\uDD3Eℍ\uD835\uDD40\uD835\uDD41\uD835\uDD42\uD835\uDD43\uD835\uDD44ℕ\uD835\uDD46ℙℚℝ\uD835\uDD4A\uD835\uDD4B\uD835\uDD4C\uD835\uDD4D\uD835\uDD4E\uD835\uDD4F\uD835\uDD50ℤ\uD835\uDD52\uD835\uDD53\uD835\uDD54\uD835\uDD55\uD835\uDD56\uD835\uDD57\uD835\uDD58\uD835\uDD59\uD835\uDD5A\uD835\uDD5B\uD835\uDD5C\uD835\uDD5D\uD835\uDD5E\uD835\uDD5F\uD835\uDD60\uD835\uDD61\uD835\uDD62\uD835\uDD63\uD835\uDD64\uD835\uDD65\uD835\uDD66\uD835\uDD67\uD835\uDD68\uD835\uDD69\uD835\uDD6A\uD835\uDD6B\uD835\uDFD8\uD835\uDFD9\uD835\uDFDA\uD835\uDFDB\uD835\uDFDC\uD835\uDFDD\uD835\uDFDE\uD835\uDFDF\uD835\uDFE0\uD835\uDFE1`!@#\$%^&*()_+-=~[]{};:'\"\\|,<.>/?"
        ),
        Pair(
            "fancy",
            "\uD835\uDC9C\uD835\uDC35\uD835\uDC9E\uD835\uDC9F\uD835\uDC38\uD835\uDC39\uD835\uDCA2\uD835\uDC3B\uD835\uDC3C\uD835\uDCA5\uD835\uDCA6\uD835\uDC3F\uD835\uDC40\uD835\uDCA9\uD835\uDCAA\uD835\uDCAB\uD835\uDCAC\uD835\uDC45\uD835\uDCAE\uD835\uDCAF\uD835\uDCB0\uD835\uDCB1\uD835\uDCB2\uD835\uDCB3\uD835\uDCB4\uD835\uDCB5\uD835\uDCB6\uD835\uDCB7\uD835\uDCB8\uD835\uDCB9\uD835\uDC52\uD835\uDCBB\uD835\uDC54\uD835\uDCBD\uD835\uDCBE\uD835\uDCBF\uD835\uDCC0\uD835\uDCC1\uD835\uDCC2\uD835\uDCC3\uD835\uDC5C\uD835\uDCC5\uD835\uDCC6\uD835\uDCC7\uD835\uDCC8\uD835\uDCC9\uD835\uDCCA\uD835\uDCCB\uD835\uDCCC\uD835\uDCCD\uD835\uDCCE\uD835\uDCCF\uD835\uDFE2\uD835\uDFE3\uD835\uDFE4\uD835\uDFE5\uD835\uDFE6\uD835\uDFE7\uD835\uDFE8\uD835\uDFE9\uD835\uDFEA\uD835\uDFEB`!@#\$%^&*()_+-=~[]{};:'\"\\|,<.>/?"
        ),
        Pair(
            "fancy bold",
            "\uD835\uDCD0\uD835\uDCD1\uD835\uDCD2\uD835\uDCD3\uD835\uDCD4\uD835\uDCD5\uD835\uDCD6\uD835\uDCD7\uD835\uDCD8\uD835\uDCD9\uD835\uDCDA\uD835\uDCDB\uD835\uDCDC\uD835\uDCDD\uD835\uDCDE\uD835\uDCDF\uD835\uDCE0\uD835\uDCE1\uD835\uDCE2\uD835\uDCE3\uD835\uDCE4\uD835\uDCE5\uD835\uDCE6\uD835\uDCE7\uD835\uDCE8\uD835\uDCE9\uD835\uDCEA\uD835\uDCEB\uD835\uDCEC\uD835\uDCED\uD835\uDCEE\uD835\uDCEF\uD835\uDCF0\uD835\uDCF1\uD835\uDCF2\uD835\uDCF3\uD835\uDCF4\uD835\uDCF5\uD835\uDCF6\uD835\uDCF7\uD835\uDCF8\uD835\uDCF9\uD835\uDCFA\uD835\uDCFB\uD835\uDCFC\uD835\uDCFD\uD835\uDCFE\uD835\uDCFF\uD835\uDD00\uD835\uDD01\uD835\uDD02\uD835\uDD030123456789`!@#\$%^&*()_+-=~[]{};:'\"\\|,<.>/?"
        ),
        Pair(
            "gothic bold",
            "\uD835\uDD6C\uD835\uDD6D\uD835\uDD6E\uD835\uDD6F\uD835\uDD70\uD835\uDD71\uD835\uDD72\uD835\uDD73\uD835\uDD74\uD835\uDD75\uD835\uDD76\uD835\uDD77\uD835\uDD78\uD835\uDD79\uD835\uDD7A\uD835\uDD7B\uD835\uDD7C\uD835\uDD7D\uD835\uDD7E\uD835\uDD7F\uD835\uDD80\uD835\uDD81\uD835\uDD82\uD835\uDD83\uD835\uDD84\uD835\uDD85\uD835\uDD86\uD835\uDD87\uD835\uDD88\uD835\uDD89\uD835\uDD8A\uD835\uDD8B\uD835\uDD8C\uD835\uDD8D\uD835\uDD8E\uD835\uDD8F\uD835\uDD90\uD835\uDD91\uD835\uDD92\uD835\uDD93\uD835\uDD94\uD835\uDD95\uD835\uDD96\uD835\uDD97\uD835\uDD98\uD835\uDD99\uD835\uDD9A\uD835\uDD9B\uD835\uDD9C\uD835\uDD9D\uD835\uDD9E\uD835\uDD9F0123456789`!@#\$%^&*()_+-=~[]{};:'\"\\|,<.>/?"
        ),
        Pair(
            "gothic",
            "\uD835\uDD04\uD835\uDD05ℭ\uD835\uDD07\uD835\uDD08\uD835\uDD09\uD835\uDD0Aℌℑ\uD835\uDD0D\uD835\uDD0E\uD835\uDD0F\uD835\uDD10\uD835\uDD11\uD835\uDD12\uD835\uDD13\uD835\uDD14ℜ\uD835\uDD16\uD835\uDD17\uD835\uDD18\uD835\uDD19\uD835\uDD1A\uD835\uDD1B\uD835\uDD1Cℨ\uD835\uDD1E\uD835\uDD1F\uD835\uDD20\uD835\uDD21\uD835\uDD22\uD835\uDD23\uD835\uDD24\uD835\uDD25\uD835\uDD26\uD835\uDD27\uD835\uDD28\uD835\uDD29\uD835\uDD2A\uD835\uDD2B\uD835\uDD2C\uD835\uDD2D\uD835\uDD2E\uD835\uDD2F\uD835\uDD30\uD835\uDD31\uD835\uDD32\uD835\uDD33\uD835\uDD34\uD835\uDD35\uD835\uDD36\uD835\uDD370123456789`!@#\$%^&*()_+-=~[]{};:'\"\\|,<.>/?"
        )
    )

    val transformer = TextTransformer(base, special)

    class TextTransformer(base: String, special: List<Pair<String, String>>) {
        val map: Map<String,
                Pair<Map<Char, Char>,
                        Map<Char, Char>>>
        val base: String = "normal"

        init {
            val map: MutableMap<String,
                    Pair<Map<Char, Char>,
                            Map<Char, Char>>> = mutableMapOf()

            for (style in special) {
                map[style.first] = style.second.mapToCharMap(base)
            }

            this.map = map.toMap()
        }
    }
}

private fun CharSequence.mapToCharMap(base: CharSequence): Pair<Map<Char, Char>, Map<Char, Char>> {
    val toBase = mutableMapOf<Char, Char>()
    val toSpecial = mutableMapOf<Char, Char>()

    forEachIndexed { index, c ->
        toSpecial[base[index]] = c
        toBase[c] = base[index]
    }

    return Pair(toSpecial, toBase)
}

/**
 * Transforms a Unicode String to special styles
 *
 * @param from The style to transfer from
 * @param to the style to transfer to
 */
fun CharSequence.styleTransform(from: String, to: String): CharSequence? {
    val out: List<Char> = if (from != TextMap.transformer.base) {
        val transformMap = TextMap.transformer.map[from]?.second ?: return null

        this.map { transformMap[it] ?: it }
    } else this.toList()

    return if (to != TextMap.transformer.base) {
        val transformMap = TextMap.transformer.map[to]?.first ?: return null

        this.map { transformMap[it] ?: it }.toString()
    } else this.toString()
}