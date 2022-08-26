# Ultra Hardcore Age of Bedwars

## 1 - Overview

UHC Age of Bedwars is a unique take on a number of different classic gamemodes, such as: Team Deathmatch, Ultra Hardcore, and Bedwars.

The gamemode is a two-team deathmatch that takes place within a survival Minecraft world. When the game starts, players spawn at the center of the world and start off with a bed, which can be placed during any point in the match. Beds act as respawn points and is tied the player who placed it, if the player dies and they have not placed their bed or it has been destroyed, they are eliminated from the game. Beds are banned from crafting and do not drop.

In addition, the game has many modifications to it that make the gamemode more unforgiving. Natural Health Regeneration and Hunger are nerfed dramatically. There will be a grace period at the start of the game. (See 4A)

To balance out the durability of playermade bases, some blocks will have increased/decreased Hardness and Blast Resistance values, and some blocks have had their recipe/output changed to increase availability. (See 3)

The game awards victory to the team who eliminates all players on the opposing team. The intended game length is 30 minutes.

## 2 - Game Specifications

World Size: 2048x2048\
Nether World: 256x256\
Natural Health Regeneration: 0.05x Speed\
Hunger Depletion Rate: 3x Speed\
Friendly Fire: Disabled\
Respawn Time: 8 + (Game Time(mins) * 0.04)\
Command /kill: Enabled (Players can suicide.)\
Sprint: Always Enabled

## 3 - Block/Item Specifications

###### 3A - Crafting Recipe Modifications

Bed: Banned\
TNT: 5x Gunpowder + 4x Sand -> 3x TNT: 3x Gunpowder + 6x Sand\
Coal/Iron/Gold/Redstone/Lapis/Diamond/Emerald/Netherite Blocks: 1x Block -> 9x Block

###### 3B - Hardness

Bed: 0.2 -> 20\
Wooden Door/Trapdoor: 3 -> 10\
Iron Door/Trapdoor: 5 -> 24\
Wood Plank: 2 -> 2.5\
Cobblestone: 2 -> 3\
Coal Block: 5 -> 4\
Obsidian: 50 -> 8\
Iron Block: 5 -> 8\
Gold Block: 5 -> 16\
Redstone Block: 5 -> 5\
Lapis Block: 3 -> 5\
Diamond Block: 5 -> 16\
Emerald Block: 5 -> 16\
Netherite Block: 50 -> 64

###### 3C - Blast Resistance

Bed: 0.2 -> 22\
Wooden Door/Trapdoor: 3 -> 12\
Iron Door/Trapdoor: 5 -> 26\
Wood Plank: 3 -> 4.5\
Cobblestone: 6 -> 5\
Coal Block: 6 -> 6\
Obsidian: 1200 -> 66\
Iron Block: 5 -> 10\
Gold Block: 5 -> 0\
Redstone Block: 6 -> 7\
Lapis Block: 6 -> 7\
Diamond Block: 5 -> 18\
Emerald Block: 5 -> 18\
Netherite Block: 1200 -> 66

###### 3D - Block/Item Modifications

Compass: Points toward enemy player/bed locations (x/z-axis). Right click to change target.\
Clock: Points toward enemy player/bed locations (y-axis). Right click to change target.\
Doors/Trapdoors: Can only be opened/closed by team members who placed them.

###### 3E - Block Drop Banlist

The following blocks will not be dropped upon player death, block break, or drop by player.

Bed\
Coal/Iron/Gold/Redstone/Lapis/Diamond/Emerald/Netherite Blocks

## 4 - Gameflow

1. When players join, they are put into a lobby area.
2. Once the game starts, the world is generated, the players are spawned in to around (0, 0). Grace period begins at this time.

###### 4A - Grace Period

During this period, the following modifications are in play:

Upon death, the player will respawn to around (0, 0) if they have not placed their bed.\
Natural Health Generation is normal, and Hunger will not deplete.\
Enemies cannot attack each other.

3. Once grace period ends, the normal gamerules are in play.
4. After the last player from one team is eliminated from the game, the victory is rewarded to the standing team.