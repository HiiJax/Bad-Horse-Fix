![Comparison Image][img-comparison]
# Bad Horse Fix

[![Modrinth Downloads][img-modrinth]][url-modrinth]
[![GitHub Downloads][img-github]][url-github]

## About
This mod fixes horse markings appearing above horse armor when using the Iris shaders mod. It requires that Iris be installed in order to work since it directly modifies Iris's rendering code. ~~It should also solve the problem for the ImmediatelyFast mod provided you also install Iris.~~  [ImmediatelyFast will likely have this fix implemented in it's next update.](https://github.com/RaphiMC/ImmediatelyFast/issues/59)

Basically, this mod checks everything being rendered to see if it contains "horse", "armor", or "markings" and if it finds anything, it forces it to be rearranged. There doesn't seem to be any noticeable performance hit.
## Version Compatibility
| BHF   | Iris  | Minecraft |
| ----- | ----- | --------- |
| 1.0.X | 1.6.X | 1.18.2 - 1.20.4 |

This is subject to change.

## Roadmap
1. Oculus/Forge Support
2. Solve root problem
3. Implement into said mods

## Modpacks
You can include this mod in modpacks that are hosted on Modrinth or that respect this mod's license (LGPL-3.0). Feel free to post it [here](https://github.com/DoonGuy/Bad-Horse-Fix/discussions/categories/modpacks) if you do include it. I'd love to check it out!

[img-comparison]: <https://doonguy.github.io/images/bhf-comparison-transparent.png>
[img-modrinth]: <https://img.shields.io/modrinth/dt/A4pJeHgM?style=for-the-badge&logo=modrinth&label=Modrinth%20Downloads&color=limegreen>
[img-github]: <https://img.shields.io/github/downloads/DoonGuy/Bad-Horse-Fix/total?style=for-the-badge&logo=github&label=GitHub%20Downloads&color=darkgray>

[url-modrinth]: <https://modrinth.com/mod/bad-horse-fix/versions>
[url-github]: <https://github.com/DoonGuy/Bad-Horse-Fix>
