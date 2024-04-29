![Comparison Image][img-comparison]
# Bad Horse Fix

[![Modrinth Downloads][img-modrinth]][url-modrinth]
[![CurseForge Downloads][img-curseforge]][url-curseforge]
[![GitHub Downloads][img-github]][url-github]

## About
This mod fixes horse markings appearing above horse armor when using the Iris shaders mod. It requires that Iris or Oculus be installed in order to work since it directly modifies Iris's rendering code.

Basically, this mod checks everything being rendered to see if it contains "horse", "armor", or "markings" and if it finds anything, it forces it to be rearranged. There doesn't seem to be any noticeable performance hit.
## Version Compatibility
Simply looking at the Modrinth/CurseForge versions section should be clear, but here's a table too, just in case:

| Iris/Oculus Version | Minecraft Version | Recommended BHF Version |
|---------------------|-------------------|-------------------------|
| 1.7.0+              | 1.20.1+           | 2.0.0                   |
| 1.2.1 - 1.6.17      | 1.17 - 1.20.4     | 1.0.1                   |

## Roadmap
1. Solve root problem
2. Implement into said mods

## Modpacks
You can include this mod in modpacks that are hosted on Modrinth or that respect this mod's license (LGPL-3.0). Feel free to post it [here](https://github.com/DoonGuy/Bad-Horse-Fix/discussions/categories/modpacks) if you do include it. I'd love to check it out!

[img-comparison]: https://doonguy.github.io/images/bhf-comparison-transparent.png

[img-modrinth]: https://img.shields.io/modrinth/dt/A4pJeHgM?style=for-the-badge&logo=modrinth&label=Modrinth%20Downloads&color=limegreen

[img-curseforge]: https://img.shields.io/curseforge/dt/999835?style=for-the-badge&logo=curseforge&label=CurseForge%20Downloads&color=orange

[img-github]: https://img.shields.io/github/downloads/DoonGuy/Bad-Horse-Fix/total?style=for-the-badge&logo=github&label=GitHub%20Downloads&color=darkgray


[url-modrinth]: https://modrinth.com/mod/bad-horse-fix

[url-curseforge]: https://www.curseforge.com/minecraft/mc-mods/bad-horse-fix

[url-github]: https://github.com/DoonGuy/Bad-Horse-Fix
