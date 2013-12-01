package poepassiveskilltreeoptimizer;

public class BuildPerks {
    
    public int flatIntel;		//\\+([0-9]+) to Intelligence
    public int flatDex;		//\\+([0-9]+) to Dexterity
    public int flatStrength;		//\\+([0-9]+) to Strength

    public int percMS;		//([0-9]+)% increased Movement Speed
    public int percLightRadius;		//([0-9]+)% increased Light Radius

            // Attack Dmg ~~
    public int flatMaxAR;		//\\+([0-9]+) to Accuracy Rating
    public int percAR;		//([0-9]+)% increased Accuracy Rating
    public int percPhysicalDmg;		//([0-9]+)% increased Physical Damage
    public int percAS;		//([0-9]+)% increased Attack Speed
    public int percMeleeAS;		//([0-9]+)% increased Melee Attack Speed
    public int percMeleePhysicalDmg;		//([0-9]+)% increased Melee Physical Damage

    public int percProjDmg;		//([0-9]+)% increased Projectile Damage
    public int percProjectileSpeed;		//([0-9]+)% increased Projectile Speed


            // Spell Dmg ~~
    public int percCastSpeed;		//([0-9]+)% increased Cast Speed
    public int percSpellDmg;		//([0-9]+)% increased Spell Damage
    public int percSpellDmgWhileLowLife;		//([0-9]+)% more Spell Damage when on Low Life


            // Buffs / CC / AOE
    public int percRadiusOfAOEs;		//([0-9]+)% increased Radius of Area Skills
    public int percAOEDmg;		//([0-9]+)% increased Area Damage

    public int percReducedEnemyStunThreshold;		//([0-9]+)% reduced Enemy Stun Threshold

    public int percFlatEffectOfBuffsOnYou;		//([0-9]+)% increased Effect of Buffs on You
    public int percDurationOfBuffsAndDebuffsWithSkills;		//([0-9]+)% increased Duration of Buffs and Debuffs you create from skills
    public int percSkillEffectDuration;		//([0-9]+)% increased Skill Effect Duration
    public int flatMaxCurse;		//Enemies can have ([0-9]+) additional Curse
    public int percCastSpeedForCurses;		//([0-9]+)% increased Cast Speed for Curses


            // Life
    public int percMaxLife;		//([0-9]+)% increased maximum Life
    public int flatMaxLife;		//\\+([0-9]+) to maximum Life
    public int flatLifeOnHitByAttacks;		//\\+([0-9]+) Life gained for each enemy hit by your Attacks
    public int flatLifeOnKill;		//\\+([0-9]+) Life gained on Kill
    public int percPhysicalDmgLifeLeech;		//([0-9]+)% of Physical Attack Damage Leeched as Life
    public int percLifeRegen;		//([0-9\\.]+)% of Life Regenerated per Second


            // ER / ES / Armour
    public int percArmour;		//([0-9]+)% increased Armour
    public int percERAndArmour;		//([0-9]+)% increased Evasion Rating and Armour
    public int flatER;		//\\+([0-9]+) to Evasion Rating
    public int percER;		//([0-9]+)% increased Evasion Rating
    public int percMaxES2;		//([0-9]+)% more Maximum Energy Shield
    public int percMaxES;		//([0-9]+)% increased maximum Energy Shield
    public int flatMaxES;		//\\+([0-9]+) to maximum Energy Shield
    public int percES_CDRecovery;		//([0-9]+)% increased Energy Shield Cooldown Recovery


            // Resistances
    public int percEleResistances;		//\\+([0-9]+)% to all Elemental Resistances
    public int percLightningRes;		//\\+([0-9]+)% to Lightning Resistance
    public int percColdRes;		//\\+([0-9]+)% to Cold Resistance
    public int percChaosRes;		//\\+([0-9]+)% to Chaos Resistance
    public int percFireRes;		//\\+([0-9]+)% to Fire Resistance
    public int percToMaxLightningRes;		//\\+([0-9]+)% to maximum Lightning Resistance
    public int percToMaxColdRes;		//\\+([0-9]+)% to maximum Cold Resistance
    public int percToMaxFireRes;		//\\+([0-9]+)% to maximum Fire Resistance


            // Other Defences
    public int percBlockRecovery;		//([0-9]+)% increased Block Recovery
    public int percBlockChanceAppliedToSpells;		//([0-9]+)% of Block Chance applied to Spells
    public int percBlockAndStunRecovery;		//([0-9]+)% increased Block and Stun Recovery
    public int percStunDuration;		//([0-9]+)% increased Stun Duration on enemies
    public int percFlatChanceToDodgeAttacks;		//([0-9]+)% additional chance to Dodge Attacks
    public int percChanceToDodgeSpellDmg;		//([0-9]+)% Chance to Dodge Spell Damage
    public int percChanceToAvoidEleStatus;		//([0-9]+)% chance to Avoid Elemental Status Ailments
    public int percChanceToAvoidBeingChilled;		//([0-9]+)% chance to Avoid being Chilled
    public int percReducedChillDurationOnYou;		//([0-9]+)% reduced Chill Duration on You
    public int percChanceToAvoidBeingFrozen;		//([0-9]+)% chance to Avoid being Frozen
    public int percChanceToAvoidBeingShocked;		//([0-9]+)% chance to Avoid being Shocked
    public int percChanceToAvoidBeingIgnited;		//([0-9]+)% chance to Avoid being Ignited
    public int percChanceToAvoidBeingStunned;		//([0-9]+)% [cC]hance to Avoid being Stunned
    public int percReducedAdditionalDmgFromCrit;		//You take ([0-9]+)% reduced Extra Damage from Critical Strikes

    public int percChanceToAvoidInterruptionWhileCasting;		//([0-9]+)% chance to Avoid Interruption while Casting
    public int percKnockbackChance;		//([0-9]+)% chance to Knock enemies Back on hit
    public int percKnockbackDistance;		//([0-9]+)% increased Knockback Distance


            // Elemental Damage
    public int percEleDmg;		//([0-9]+)% increased Elemental Damage
    public int percEleDmgWithSpells;		//([0-9]+)% increased Elemental Damage with Spells

    public int percLightningDmg;		//([0-9]+)% increased Lightning Damage
    public int percChanceToShock;		//([0-9]+)% Chance to Shock
    public int percShockDuration;		//([0-9]+)% increased Shock Duration on enemies

    public int percColdDmg;		//([0-9]+)% increased Cold Damage
    public int percChillDuration;		//([0-9]+)% increased Chill Duration on enemies
    public int percChanceToFreeze;		//([0-9]+)% Chance to Freeze
    public int percFreezeDuration;		//([0-9]+)% increased Freeze Duration on enemies

    public int percFireDmg;		//([0-9]+)% increased Fire Damage
    public int percBurningDmg;		//([0-9]+)% increased Burning Damage
    public int percChanceToIgnite;		//([0-9]+)% Chance to Ignite
    public int percIgniteDuration;		//([0-9]+)% increased Ignite Duration on enemies

    public int percPhysicalDmgConvertedToFireDamage;		//([0-9]+)% of Physical Damage Converted to Fire Damage
    public int percLightningDmgConvertedToFireDamage;		//([0-9]+)% of Lightning Damage Converted to Fire Damage
    public int percColdDmgConvertedToFireDamage;		//([0-9]+)% of Cold Damage Converted to Fire Damage


            // Crit
    public int percCritChance;		//([0-9]+)% increased Critical Strike Chance
    public int percCritMultiplier;		//([0-9]+)% increased Critical Strike Multiplier
    public int percCritMultiplierForSpells;		//([0-9]+)% increased Critical Strike Multiplier for Spells
    public int percCritChanceForSpells;		//([0-9]+)% increased Critical Strike Chance for Spells


            // Mana
    public int percMaxMana;		//([0-9]+)% increased maximum Mana
    public int flatMaxMana;		//\\+([0-9]+) to maximum Mana
    public int percManaRegen;		//([0-9]+)% increased Mana Regeneration Rate
    public int percReducedManaCostOfSkills;		//([0-9]+)% reduced Mana Cost of Skills
    public int percPhysicalAttackDmgManaLeech;		//([0-9]+)% of Physical Attack Damage Leeched as Mana
    public int flatManaOnKill;		//\\+([0-9]+) Mana Gained on Kill


            // Auras
    public int percReducedManaReserved;		//([0-9]+)% reduced Mana Reserved
    public int percLessManaReserved;		//([0-9]+)% less Mana Reserved
    public int percEffectOfAuras;		//([0-9]+)% increased effect of Auras you Cast
    public int percRadiusOfAuras;		//([0-9]+)% increased Radius of Auras


            // Charges
    public int percMaxHPRegenPerEnduranceCharge;		//([0-9]+)% of maximum Life Regenerated per second per Endurance Charge
    public int percEnduranceChargeDuration;		//([0-9]+)% increased Endurance Charge Duration
    public int percPowerChargeDuration;		//([0-9]+)% increased Power Charge Duration
    public int flatMaxPowerCharge;		//\\+([0-9]+) Maximum Power Charge
    public int flatMaxFrenzyCharge;		//\\+([0-9]+) Maximum Frenzy Charge
    public int flatMaxEnduranceCharge;		//\\+([0-9]+) Maximum Endurance Charge
    public int percFrenzyChargeDuration;		//([0-9]+)% increased Frenzy Charge Duration
    public int percSpellDmgPerPowerCharge;		//([0-9]+)% increased Spell Damage per Power Charge
    public int percERPerFrenzyCharge;		//([0-9]+)% increased Evasion Rating per Frenzy Charge
    public int percLifeRegenPerEnduranceCharge;		//([0-9\\.]+)% of maximum Life Regenerated per second per Endurance Charge



            // Weapons
    public int flatMeleeWeaponAndUnarmedRange;		//\\+([0-9]+) to Melee Weapon and Unarmed range

    public int percEleDmgWithWeapons;		//([0-9]+)% increased Elemental Damage with Weapons
    public int percColdDmgWithWeapons;		//([0-9]+)% increased Cold Damage with Weapons
    public int percFireDmgWithWeapons;		//([0-9]+)% increased Fire Damage with Weapons
    public int percLightningDmgWithWeapons;		//([0-9]+)% increased Lightning Damage with Weapons


            // 1H Melee Weapons
    public int percPhysicalDmgWith1HWeapons;		//([0-9]+)% increased Physical Damage with One Handed Melee Weapons
    public int percASWith1HMeleeWeapons;		//([0-9]+)% increased Attack Speed with One Handed Melee Weapons
    public int percARWith1HMeleeWeapons;		//([0-9]+)% increased Accuracy Rating with One Handed Melee Weapons
    public int percCritChanceWith1HMeleeWeapons;		//([0-9]+)% increased Critical Strike Chance with One Handed Melee Weapons
    public int percCritMultiplierWith1HMeleeWeapon;		//([0-9]+)% increased Critical Strike Multiplier with One Handed Melee Weapons


            // Shields
    public int percEleResWhileHoldingShield;		//\\+([0-9]+)% Elemental Resistances while holding a Shield
    public int percBlockChanceWithShield;		//([0-9]+)% additional Chance to Block with Shields
    public int percESFromShield;		//([0-9]+)% increased Energy Shield from equipped Shield
    public int percDefencesFromShield;		//([0-9]+)% increased Defences from equipped Shield

    public int percChanceToBlockWhileDualWieldingOrHoldingShield;		//([0-9]+)% additional Chance to Block while Dual Wielding or holding a Shield


            // Dual Wielding
    public int percASWhileDualWielding;		//([0-9]+)% increased Attack Speed while Dual Wielding
    public int percPhysDmgWhileDualWielding;		//([0-9]+)% increased Physical Weapon Damage while Dual Wielding
    public int flatPercChanceToBlockWhileDualWielding;		//([0-9]+)% additional Chance to Block while Dual Wielding
    public int percWeaponCritChanceWhileDualWielding;		//([0-9]+)% increased Weapon Critical Strike Chance while Dual Wielding
    public int percARWhileDualWielding;		//([0-9]+)% increased Accuracy Rating while Dual Wielding


            // 2H Melee Weapons
    public int percPhysicalDmgWith2HWeapons;		//([0-9]+)% increased Physical Damage with Two Handed Melee Weapons
    public int percASWith2HWeapons;		//([0-9]+)% increased Attack Speed with Two Handed Melee Weapons
    public int percStunDurationWith2HWeapons;		//([0-9]+)% increased Stun Duration with Two Handed Melee Weapons on enemies
    public int percCritWith2HMeleeWeapons;		//([0-9]+)% increased Critical Strike Chance with Two Handed Melee Weapons
    public int percARWith2HMeleeWeapons;		//([0-9]+)% increased Accuracy Rating with Two Handed Melee Weapons



            // Axes
    public int percPhysicalDmgWithAxes;		//([0-9]+)% increased Physical Damage with Axes
    public int percARWithAxes;		//([0-9]+)% increased Accuracy Rating with Axes
    public int percASWithAxes;		//([0-9]+)% increased Attack Speed with Axes


            // Staves
    public int percGlobalCritMultiplierWithStaff;		//([0-9]+)% increased Global Critical Strike Multiplier while wielding a Staff
    public int percGlobalCritChanceWithStaff;		//([0-9]+)% increased Global Critical Strike Chance while wielding a Staff
    public int percPhysicalDmgWithStaves;		//([0-9]+)% increased Physical Damage with Staves
    public int percBlockChanceWithStaves;		//([0-9]+)% additional Block Chance With Staves
    public int percStunDurationWithStaves;		//([0-9]+)% increased Stun Duration with Staves on enemies
    public int percASWithStaves;		//([0-9]+)% increased Attack Speed with Staves
    public int percARWithStaves;		//([0-9]+)% increased Accuracy Rating with Staves


            // Bows
    public int percStunDurationWithBows;		//([0-9]+)% increased Stun Duration with Bows on enemies
    public int percPhysicalDmgWithBows;		//([0-9]+)% increased Physical Damage with Bows
    public int percARWithBows;		//([0-9]+)% increased Accuracy Rating with Bows
    public int percCritChanceWithBows;		//([0-9]+)% increased Critical Strike Chance with Bows
    public int percCritMultiplierWithBows;		//([0-9]+)% increased Critical Strike Multiplier with Bows
    public int percASWithBows;		//([0-9]+)% increased Attack Speed with Bows
    public int percArrowSpeed;		//([0-9]+)% increased Arrow Speed
    public int percChanceArrowPiercing;		//([0-9]+)% chance of Arrows Piercing



            // Claws
    public int percPhysicalDmgWithClaws;		//([0-9]+)% increased Physical Damage with Claws
    public int percPhysicalDmgLifeLeechWithClaws;		//([0-9]+)% of Physical Damage Dealt with Claws Leeched as Life
    public int percASWithClaws;		//([0-9]+)% increased Attack Speed with Claws
    public int percARWithClaws;		//([0-9]+)% increased Accuracy Rating with Claws
    public int percCritChanceWithClaws;		//([0-9]+)% increased Critical Strike Chance with Claws


            // Swords
    public int percReducedEnemyChanceToBlockSwordAttacks;		//([0-9]+)% reduced enemy chance to Block Sword Attacks
    public int percPhysicalDmgWithSwords;		//([0-9]+)% increased Physical Damage with Swords
    public int percCritMultiplierWithSwords;		//([0-9]+)% increased Critical Strike Multiplier with Swords
    public int percASWithSwords;		//([0-9]+)% increased Attack Speed with Swords
    public int percARWithSwords;		//([0-9]+)% increased Accuracy Rating with Swords


            // Daggers
    public int percPhysicalDmgWithDaggers;		//([0-9]+)% increased Physical Damage with Daggers
    public int percASWithDaggers;		//([0-9]+)% increased Attack Speed with Daggers
    public int percARWithDaggers;		//([0-9]+)% increased Accuracy Rating with Daggers
    public int percCritMultiplierWithDaggers;		//([0-9]+)% increased Critical Strike Multiplier with Daggers
    public int percCritChanceWithDaggers;		//([0-9]+)% increased Critical Strike Chance with Daggers


            // Maces
    public int percCritMultiplierWithMaces;		//([0-9]+)% increased Critical Strike Multiplier with Maces
    public int percASWithMaces;		//([0-9]+)% increased Attack Speed with Maces
    public int percARWithMaces;		//([0-9]+)% increased Accuracy Rating with Maces
    public int percPhysicalDmgWithMaces;		//([0-9]+)% increased Physical Damage with Maces
    public int percReducedStunThresholdWithMaces;		//([0-9]+)% reduced Enemy Stun Threshold with Maces
    public int percEleDmgWithMaces;		//([0-9]+)% increased Elemental Damage with Maces


            // Wands
    public int percEleDmgWithWands;		//([0-9]+)% increased Elemental Damage with Wands
    public int percWandDmgPerPowerCharge;		//([0-9]+)% increased Wand Damage per Power Charge
    public int percARWithWands;		//([0-9]+)% increased Accuracy Rating with Wands
    public int percPhysicalDmgWithWands;		//([0-9]+)% increased Physical Damage with Wands
    public int percWandPhysicalDmgAddedAsColdDmg;		//([0-9]+)% of Wand Physical Damage Added as Cold Damage
    public int percWandPhysicalDmgAddedAsFireDmg;		//([0-9]+)% of Wand Physical Damage Added as Fire Damage
    public int percWandPhysicalDmgAddedAsLightningDmg;		//([0-9]+)% of Wand Physical Damage Added as Lightning Damage
    public int percASWithWands;		//([0-9]+)% increased Attack Speed with Wands



            // Totems
    public int percCastSpeedForSummoningTotems;		//([0-9]+)% increased Casting Speed for Summoning Totems
    public int percTotemsEleResistances;		//Totems gain \\+([0-9]+)% to all Elemental Resistances
    public int percTotemDmg;		//([0-9]+)% increased Totem Damage
    public int percTotemPhysicalDmgReduction;		//Totems have ([0-9]+)% additional Physical Damage Reduction
    public int percTotemLife;		//([0-9]+)% increased Totem Life
    public int percTotemDuration;		//([0-9]+)% increased Totem Duration
    public int percTotemRange;		//([0-9]+)% increased Totem Range
    public int flatMaxTotem;		//Can summon up to ([0-9]+) additional totem
    public int percSpellCastTotemCastSpeed;		//Spells Cast by Totems have ([0-9]+)% increased Cast Speed
    public int percAttackTotemAS;		//Attacks used by Totems have ([0-9]+)% increased Attack Speed


            // Summoners / Traps / Mines
    public int percMinionDmg;		//Minions deal ([0-9]+)% increased Damage
    public int percMinionMaxLife;		//Minions have ([0-9]+)% increased maximum Life
    public int flatMaxNumberOfZombies;		//\\+([0-9]+) to Maximum number of Zombies
    public int flatMaxNumberOfSkeletons;		//\\+([0-9]+) to Maximum number of Skeletons
    public int flatMaxNumberOfSpectres;		//\\+([0-9]+) to Maximum number of Spectres

    public int flatMaxTrap;		//Can set up to ([0-9]+) additional trap
    public int percTrapDuration;		//([0-9]+)% increased Trap Duration
    public int percTrapThrowingSpeed;		//([0-9]+)% increased Trap Throwing Speed
    public int percTrapDmg;		//([0-9]+)% increased Trap Damage
    public int percTrapTriggerRadius;		//([0-9]+)% increased Trap Trigger Radius
    public int percTrapDmgEleResPenetration;		//Trap Damage Penetrates ([0-9]+)% Elemental Resistances

    public int flatMaxRemoteMine;		//Can set up to ([0-9]+) additional remote mine
    public int percMineLayingSpeed;		//([0-9]+)% increased Mine Laying Speed
    public int percMineDmg;		//([0-9]+)% increased Mine Damage
    public int percMineDuration;		//([0-9]+)% increased Mine Duration
    public int percMineDetonationRadius;		//([0-9]+)% increased Mine Detonation Radius
    public int percMineDmgEleResPenetration;		//Mine Damage Penetrates ([0-9]+)% Elemental Resistances


            // Flasks
    public int percFlaskRecoverySpeed;		//([0-9]+)% increased Flask Recovery Speed
    public int percLifeRecoveryFromFlasks;		//([0-9]+)% increased Life Recovery from Flasks
    public int percManaRecoveryFromFlasks;		//([0-9]+)% increased Mana Recovery from Flasks
    public int percFlaskEffects;		//([0-9]+)% increased effect of Flasks
    
    public int ironReflexes;

    public BuildPerks( int[] values ) {
        this.flatIntel = values[0];
        this.flatDex = values[1];
        this.flatStrength = values[2];
        this.percMS = values[3];
        this.percLightRadius = values[4];
        this.flatMaxAR = values[5];
        this.percAR = values[6];
        this.percPhysicalDmg = values[7];
        this.percAS = values[8];
        this.percMeleeAS = values[9];
        this.percMeleePhysicalDmg = values[10];
        this.percProjDmg = values[11];
        this.percProjectileSpeed = values[12];
        this.percCastSpeed = values[13];
        this.percSpellDmg = values[14];
        this.percSpellDmgWhileLowLife = values[15];
        this.percRadiusOfAOEs = values[16];
        this.percAOEDmg = values[17];
        this.percReducedEnemyStunThreshold = values[18];
        this.percFlatEffectOfBuffsOnYou = values[19];
        this.percDurationOfBuffsAndDebuffsWithSkills = values[20];
        this.percSkillEffectDuration = values[21];
        this.flatMaxCurse = values[22];
        this.percCastSpeedForCurses = values[23];
        this.percMaxLife = values[24];
        this.flatMaxLife = values[25];
        this.flatLifeOnHitByAttacks = values[26];
        this.flatLifeOnKill = values[27];
        this.percPhysicalDmgLifeLeech = values[28];
        this.percLifeRegen = values[29];
        this.percArmour = values[30];
        this.percERAndArmour = values[31];
        this.flatER = values[32];
        this.percER = values[33];
        this.percMaxES2 = values[34];
        this.percMaxES = values[35];
        this.flatMaxES = values[36];
        this.percES_CDRecovery = values[37];
        this.percEleResistances = values[38];
        this.percLightningRes = values[39];
        this.percColdRes = values[40];
        this.percChaosRes = values[41];
        this.percFireRes = values[42];
        this.percToMaxLightningRes = values[43];
        this.percToMaxColdRes = values[44];
        this.percToMaxFireRes = values[45];
        this.percBlockRecovery = values[46];
        this.percBlockChanceAppliedToSpells = values[47];
        this.percBlockAndStunRecovery = values[48];
        this.percStunDuration = values[49];
        this.percFlatChanceToDodgeAttacks = values[50];
        this.percChanceToDodgeSpellDmg = values[51];
        this.percChanceToAvoidEleStatus = values[52];
        this.percChanceToAvoidBeingChilled = values[53];
        this.percReducedChillDurationOnYou = values[54];
        this.percChanceToAvoidBeingFrozen = values[55];
        this.percChanceToAvoidBeingShocked = values[56];
        this.percChanceToAvoidBeingIgnited = values[57];
        this.percChanceToAvoidBeingStunned = values[58];
        this.percReducedAdditionalDmgFromCrit = values[59];
        this.percChanceToAvoidInterruptionWhileCasting = values[60];
        this.percKnockbackChance = values[61];
        this.percKnockbackDistance = values[62];
        this.percEleDmg = values[63];
        this.percEleDmgWithSpells = values[64];
        this.percLightningDmg = values[65];
        this.percChanceToShock = values[66];
        this.percShockDuration = values[67];
        this.percColdDmg = values[68];
        this.percChillDuration = values[69];
        this.percChanceToFreeze = values[70];
        this.percFreezeDuration = values[71];
        this.percFireDmg = values[72];
        this.percBurningDmg = values[73];
        this.percChanceToIgnite = values[74];
        this.percIgniteDuration = values[75];
        this.percPhysicalDmgConvertedToFireDamage = values[76];
        this.percLightningDmgConvertedToFireDamage = values[77];
        this.percColdDmgConvertedToFireDamage = values[78];
        this.percCritChance = values[79];
        this.percCritMultiplier = values[80];
        this.percCritMultiplierForSpells = values[81];
        this.percCritChanceForSpells = values[82];
        this.percMaxMana = values[83];
        this.flatMaxMana = values[84];
        this.percManaRegen = values[85];
        this.percReducedManaCostOfSkills = values[86];
        this.percPhysicalAttackDmgManaLeech = values[87];
        this.flatManaOnKill = values[88];
        this.percReducedManaReserved = values[89];
        this.percLessManaReserved = values[90];
        this.percEffectOfAuras = values[91];
        this.percRadiusOfAuras = values[92];
        this.percMaxHPRegenPerEnduranceCharge = values[93];
        this.percEnduranceChargeDuration = values[94];
        this.percPowerChargeDuration = values[95];
        this.flatMaxPowerCharge = values[96];
        this.flatMaxFrenzyCharge = values[97];
        this.flatMaxEnduranceCharge = values[98];
        this.percFrenzyChargeDuration = values[99];
        this.percSpellDmgPerPowerCharge = values[100];
        this.percERPerFrenzyCharge = values[101];
        this.percLifeRegenPerEnduranceCharge = values[102];
        this.flatMeleeWeaponAndUnarmedRange = values[103];
        this.percEleDmgWithWeapons = values[104];
        this.percColdDmgWithWeapons = values[105];
        this.percFireDmgWithWeapons = values[106];
        this.percLightningDmgWithWeapons = values[107];
        this.percPhysicalDmgWith1HWeapons = values[108];
        this.percASWith1HMeleeWeapons = values[109];
        this.percARWith1HMeleeWeapons = values[110];
        this.percCritChanceWith1HMeleeWeapons = values[111];
        this.percCritMultiplierWith1HMeleeWeapon = values[112];
        this.percEleResWhileHoldingShield = values[113];
        this.percBlockChanceWithShield = values[114];
        this.percESFromShield = values[115];
        this.percDefencesFromShield = values[116];
        this.percChanceToBlockWhileDualWieldingOrHoldingShield = values[117];
        this.percASWhileDualWielding = values[118];
        this.percPhysDmgWhileDualWielding = values[119];
        this.flatPercChanceToBlockWhileDualWielding = values[120];
        this.percWeaponCritChanceWhileDualWielding = values[121];
        this.percARWhileDualWielding = values[122];
        this.percPhysicalDmgWith2HWeapons = values[123];
        this.percASWith2HWeapons = values[124];
        this.percStunDurationWith2HWeapons = values[125];
        this.percCritWith2HMeleeWeapons = values[126];
        this.percARWith2HMeleeWeapons = values[127];
        this.percPhysicalDmgWithAxes = values[128];
        this.percARWithAxes = values[129];
        this.percASWithAxes = values[130];
        this.percGlobalCritMultiplierWithStaff = values[131];
        this.percGlobalCritChanceWithStaff = values[132];
        this.percPhysicalDmgWithStaves = values[133];
        this.percBlockChanceWithStaves = values[134];
        this.percStunDurationWithStaves = values[135];
        this.percASWithStaves = values[136];
        this.percARWithStaves = values[137];
        this.percStunDurationWithBows = values[138];
        this.percPhysicalDmgWithBows = values[139];
        this.percARWithBows = values[140];
        this.percCritChanceWithBows = values[141];
        this.percCritMultiplierWithBows = values[142];
        this.percASWithBows = values[143];
        this.percArrowSpeed = values[144];
        this.percChanceArrowPiercing = values[145];
        this.percPhysicalDmgWithClaws = values[146];
        this.percPhysicalDmgLifeLeechWithClaws = values[147];
        this.percASWithClaws = values[148];
        this.percARWithClaws = values[149];
        this.percCritChanceWithClaws = values[150];
        this.percReducedEnemyChanceToBlockSwordAttacks = values[151];
        this.percPhysicalDmgWithSwords = values[152];
        this.percCritMultiplierWithSwords = values[153];
        this.percASWithSwords = values[154];
        this.percARWithSwords = values[155];
        this.percPhysicalDmgWithDaggers = values[156];
        this.percASWithDaggers = values[157];
        this.percARWithDaggers = values[158];
        this.percCritMultiplierWithDaggers = values[159];
        this.percCritChanceWithDaggers = values[160];
        this.percCritMultiplierWithMaces = values[161];
        this.percASWithMaces = values[162];
        this.percARWithMaces = values[163];
        this.percPhysicalDmgWithMaces = values[164];
        this.percReducedStunThresholdWithMaces = values[165];
        this.percEleDmgWithMaces = values[166];
        this.percEleDmgWithWands = values[167];
        this.percWandDmgPerPowerCharge = values[168];
        this.percARWithWands = values[169];
        this.percPhysicalDmgWithWands = values[170];
        this.percWandPhysicalDmgAddedAsColdDmg = values[171];
        this.percWandPhysicalDmgAddedAsFireDmg = values[172];
        this.percWandPhysicalDmgAddedAsLightningDmg = values[173];
        this.percASWithWands = values[174];
        this.percCastSpeedForSummoningTotems = values[175];
        this.percTotemsEleResistances = values[176];
        this.percTotemDmg = values[177];
        this.percTotemPhysicalDmgReduction = values[178];
        this.percTotemLife = values[179];
        this.percTotemDuration = values[180];
        this.percTotemRange = values[181];
        this.flatMaxTotem = values[182];
        this.percSpellCastTotemCastSpeed = values[183];
        this.percAttackTotemAS = values[184];
        this.percMinionDmg = values[185];
        this.percMinionMaxLife = values[186];
        this.flatMaxNumberOfZombies = values[187];
        this.flatMaxNumberOfSkeletons = values[188];
        this.flatMaxNumberOfSpectres = values[189];
        this.flatMaxTrap = values[190];
        this.percTrapDuration = values[191];
        this.percTrapThrowingSpeed = values[192];
        this.percTrapDmg = values[193];
        this.percTrapTriggerRadius = values[194];
        this.percTrapDmgEleResPenetration = values[195];
        this.flatMaxRemoteMine = values[196];
        this.percMineLayingSpeed = values[197];
        this.percMineDmg = values[198];
        this.percMineDuration = values[199];
        this.percMineDetonationRadius = values[200];
        this.percMineDmgEleResPenetration = values[201];
        this.percFlaskRecoverySpeed = values[202];
        this.percLifeRecoveryFromFlasks = values[203];
        this.percManaRecoveryFromFlasks = values[204];
        this.percFlaskEffects = values[205];
        this.ironReflexes = values[206];
    }

    
    
}
