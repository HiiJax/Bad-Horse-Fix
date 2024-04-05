![image](https://doonguy.github.io/images/bhf-comparison-transparent.png)
# Bad Horse Fix
A Bad Fix for Bad Horses. Check it out on.

[![Modrinth Downloads][img-modrinth]][url-modrinth]
[![GitHub Downloads][img-github]][url-github]

## About
This mod fixes horse markings appearing above horse armor when using the Iris shaders mod. It requires that Iris be installed in order to work since it directly modifies Iris's rendering code. It should also solve the problem for the ImmediatelyFast mod provided you also install Iris.

Basically, this mod checks everything being rendered to see if it contains "horse", "armor", or "markings" and if it finds anything it forces it to be rearranged. There doesn't seem to be any noticeable performance hit.
## Version Compatibility
| BHF   | Iris  | Minecraft |
| ----- | ----- | --------- |
| 1.0.X | 1.6.X | 1.18.2 - 1.20.4 |
| 1.1.X (planned) | 1.7.0 | 1.20.4+ | 

This is subject to change.

## FAQ

#### Why doesn't Iris just implement this?
- This mod does not solve the root problem. I actually did submit a pull request with the changes and one of the devs suggested a much better solution that I'm still looking into. You can see more details here: https://github.com/IrisShaders/Iris/pull/2289

#### If there's a better possible solution, why didn't you focus on that?
- I hadn't made a mod before so I thought this would be a good opportunity to. I also need to learn a lot more before coming up with a proper solution to provide to the Iris team so I thought this would be a good temporary solution and possibly teach me a few of those things.

#### What causes the problem in the first place?
- It has to do with [batched entity rendering](https://github.com/coderbot16/batched-entity-rendering), which Iris implements. Horse armor is considered opaque while markings are translucent. Putting it simply, one thing batched entity rendering does is render all opaque things before translucent. Overall, it's a great optimization but causes this problem.

#### How does this fix the problem for ImmediatelyFast?
- I haven't looked at the source code for that mod but I imagine that it has some kind of batched-entity-rendering-like system but let's Iris take over if it's installed.

#### Can I use this mod in my modpack?
- Yes! But please keep in mind it hasn't gone through very much testing.

#### Are these questions actually frequently asked?
- No, I just like providing information this way :)

[img-modrinth]: <https://img.shields.io/modrinth/dt/A4pJeHgM?style=for-the-badge&logo=modrinth&label=Modrinth%20Downloads&color=limegreen>
[img-github]: <https://img.shields.io/github/downloads/DoonGuy/Bad-Horse-Fix/total?style=for-the-badge&logo=github&label=GitHub%20Downloads&color=darkgray>

[url-modrinth]: <https://modrinth.com/mod/bad-horse-fix>
[url-github]: <https://github.com/DoonGuy/Bad-Horse-Fix/releases>
