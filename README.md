![Comparison Image][img-comparison]
# Bad Horse Fix

[![Modrinth Downloads][img-modrinth]][url-modrinth]
[![CurseForge Downloads][img-curseforge]][url-curseforge]
[![GitHub Downloads][img-github]][url-github]

## About
This mod fixes horse markings appearing above horse armor when using the Iris shaders mod. It requires that Iris be installed in order to work since it directly modifies Iris's rendering code. ~~It should also solve the problem for the ImmediatelyFast mod provided you also install Iris.~~  [ImmediatelyFast will likely have this fix implemented in it's next update.](https://github.com/RaphiMC/ImmediatelyFast/issues/59)

Basically, this mod checks everything being rendered to see if it contains "horse", "armor", or "markings" and if it finds anything, it forces it to be rearranged. There doesn't seem to be any noticeable performance hit.
## Version Compatibility
### Basically, if you are on a relatively new, *non-beta* version of Iris or Oculus, this mod should work. 
But here is a chart, if you want more details:

| Mod    | Mod Version  | Minecraft Version | Loader Version                     |
| ------ | ------------ | ----------------- | ---------------------------------- |
| Iris   | 1.2.1+       | 1.17+             | Follow Iris Requirements           |
| Oculus | 1.2.5+       | 1.18.2+           | Forge 40.1+/NeoForge Follow Oculus |

This is applies to BHF 1.0.1 and is subject to change.

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
