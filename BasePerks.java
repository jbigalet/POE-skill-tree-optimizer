package poepassiveskilltreeoptimizer;

public final class BasePerks {
    
    private final static String[][] perkInit = {

        {"flatIntel", "\\+([0-9]+) to Intelligence"},
        {"flatDex","\\+([0-9]+) to Dexterity"},
        {"flatStrength","\\+([0-9]+) to Strength"},
		
        {"percMS","([0-9]+)% increased Movement Speed"},
        {"percLightRadius","([0-9]+)% increased Light Radius"},
			
			// Attack Dmg ~~
        {"flatMaxAR","\\+([0-9]+) to Accuracy Rating"},
        {"percAR","([0-9]+)% increased Accuracy Rating"},
        {"percPhysicalDmg","([0-9]+)% increased Physical Damage"},
        {"percAS","([0-9]+)% increased Attack Speed"},
        {"percMeleeAS","([0-9]+)% increased Melee Attack Speed"},
        {"percMeleePhysicalDmg","([0-9]+)% increased Melee Physical Damage"},

        {"percProjDmg","([0-9]+)% increased Projectile Damage"},
        {"percProjectileSpeed","([0-9]+)% increased Projectile Speed"},

		
			// Spell Dmg ~~
        {"percCastSpeed","([0-9]+)% increased Cast Speed"},
        {"percSpellDmg","([0-9]+)% increased Spell Damage"},
        {"percSpellDmgWhileLowLife","([0-9]+)% more Spell Damage when on Low Life"},
		
		
			// Buffs / CC / AOE
        {"percRadiusOfAOEs","([0-9]+)% increased Radius of Area Skills"},
        {"percAOEDmg","([0-9]+)% increased Area Damage"},
		
        {"percReducedEnemyStunThreshold","([0-9]+)% reduced Enemy Stun Threshold"},
		
        {"percFlatEffectOfBuffsOnYou","([0-9]+)% increased Effect of Buffs on You"},
        {"percDurationOfBuffsAndDebuffsWithSkills","([0-9]+)% increased Duration of Buffs and Debuffs you create from skills"},
        {"percSkillEffectDuration","([0-9]+)% increased Skill Effect Duration"},
        {"flatMaxCurse","Enemies can have ([0-9]+) additional Curse"},
        {"percCastSpeedForCurses","([0-9]+)% increased Cast Speed for Curses"},
		
		
			// Life
        {"percMaxLife", "([0-9]+)% increased maximum Life"},
        {"flatMaxLife","\\+([0-9]+) to maximum Life"},
        {"flatLifeOnHitByAttacks","\\+([0-9]+) Life gained for each enemy hit by your Attacks"},
        {"flatLifeOnKill","\\+([0-9]+) Life gained on Kill"},
        {"percPhysicalDmgLifeLeech","([0-9]+)% of Physical Attack Damage Leeched as Life"},
        {"percLifeRegen","([0-9\\.]+)% of Life Regenerated per Second"},
		
		
			// ER / ES / Armour
        {"percArmour","([0-9]+)% increased Armour"},
        {"percERAndArmour","([0-9]+)% increased Evasion Rating and Armour"},
        {"flatER","\\+([0-9]+) to Evasion Rating"},
        {"percER","([0-9]+)% increased Evasion Rating"},
        {"percMaxES2","([0-9]+)% more Maximum Energy Shield"},
        {"percMaxES","([0-9]+)% increased maximum Energy Shield"},
        {"flatMaxES","\\+([0-9]+) to maximum Energy Shield"},
        {"percES_CDRecovery","([0-9]+)% increased Energy Shield Cooldown Recovery"},
		
		
			// Resistances
        {"percEleResistances","\\+([0-9]+)% to all Elemental Resistances"},
        {"percLightningRes","\\+([0-9]+)% to Lightning Resistance"},
        {"percColdRes","\\+([0-9]+)% to Cold Resistance"},
        {"percChaosRes","\\+([0-9]+)% to Chaos Resistance"},
        {"percFireRes","\\+([0-9]+)% to Fire Resistance"},
        {"percToMaxLightningRes","\\+([0-9]+)% to maximum Lightning Resistance"},
        {"percToMaxColdRes","\\+([0-9]+)% to maximum Cold Resistance"},
        {"percToMaxFireRes","\\+([0-9]+)% to maximum Fire Resistance"},
		
		
			// Other Defences
        {"percBlockRecovery","([0-9]+)% increased Block Recovery"},
        {"percBlockChanceAppliedToSpells","([0-9]+)% of Block Chance applied to Spells"},
        {"percBlockAndStunRecovery","([0-9]+)% increased Block and Stun Recovery"},
        {"percStunDuration","([0-9]+)% increased Stun Duration on enemies"},
        {"percFlatChanceToDodgeAttacks","([0-9]+)% additional chance to Dodge Attacks"},
        {"percChanceToDodgeSpellDmg","([0-9]+)% Chance to Dodge Spell Damage"},
        {"percChanceToAvoidEleStatus","([0-9]+)% chance to Avoid Elemental Status Ailments"},
        {"percChanceToAvoidBeingChilled","([0-9]+)% chance to Avoid being Chilled"},
        {"percReducedChillDurationOnYou","([0-9]+)% reduced Chill Duration on You"},
        {"percChanceToAvoidBeingFrozen","([0-9]+)% chance to Avoid being Frozen"},
        {"percChanceToAvoidBeingShocked","([0-9]+)% chance to Avoid being Shocked"},
        {"percChanceToAvoidBeingIgnited","([0-9]+)% chance to Avoid being Ignited"},
        {"percChanceToAvoidBeingStunned","([0-9]+)% [cC]hance to Avoid being Stunned"},
        {"percReducedAdditionalDmgFromCrit","You take ([0-9]+)% reduced Extra Damage from Critical Strikes"},
		
        {"percChanceToAvoidInterruptionWhileCasting","([0-9]+)% chance to Avoid Interruption while Casting"},
        {"percKnockbackChance","([0-9]+)% chance to Knock enemies Back on hit"},
        {"percKnockbackDistance","([0-9]+)% increased Knockback Distance"},

		
			// Elemental Damage
        {"percEleDmg","([0-9]+)% increased Elemental Damage"},
        {"percEleDmgWithSpells","([0-9]+)% increased Elemental Damage with Spells"},

        {"percLightningDmg","([0-9]+)% increased Lightning Damage"},
        {"percChanceToShock","([0-9]+)% Chance to Shock"},
        {"percShockDuration","([0-9]+)% increased Shock Duration on enemies"},

        {"percColdDmg","([0-9]+)% increased Cold Damage"},
        {"percChillDuration","([0-9]+)% increased Chill Duration on enemies"},
        {"percChanceToFreeze","([0-9]+)% Chance to Freeze"},
        {"percFreezeDuration","([0-9]+)% increased Freeze Duration on enemies"},

        {"percFireDmg","([0-9]+)% increased Fire Damage"},
        {"percBurningDmg","([0-9]+)% increased Burning Damage"},
        {"percChanceToIgnite","([0-9]+)% Chance to Ignite"},
		{"percIgniteDuration","([0-9]+)% increased Ignite Duration on enemies"},

        {"percPhysicalDmgConvertedToFireDamage","([0-9]+)% of Physical Damage Converted to Fire Damage"},
        {"percLightningDmgConvertedToFireDamage","([0-9]+)% of Lightning Damage Converted to Fire Damage"},
        {"percColdDmgConvertedToFireDamage","([0-9]+)% of Cold Damage Converted to Fire Damage"},

		
			// Crit
        {"percCritChance","([0-9]+)% increased Critical Strike Chance"},
        {"percCritMultiplier","([0-9]+)% increased Critical Strike Multiplier"},
        {"percCritMultiplierForSpells","([0-9]+)% increased Critical Strike Multiplier for Spells"},
        {"percCritChanceForSpells","([0-9]+)% increased Critical Strike Chance for Spells"},
		
		
			// Mana
        {"percMaxMana","([0-9]+)% increased maximum Mana"},
        {"flatMaxMana","\\+([0-9]+) to maximum Mana"},
        {"percManaRegen","([0-9]+)% increased Mana Regeneration Rate"},
        {"percReducedManaCostOfSkills","([0-9]+)% reduced Mana Cost of Skills"},
        {"percPhysicalAttackDmgManaLeech","([0-9]+)% of Physical Attack Damage Leeched as Mana"},
        {"flatManaOnKill","\\+([0-9]+) Mana Gained on Kill"},
		
		
			// Auras
        {"percReducedManaReserved","([0-9]+)% reduced Mana Reserved"},
        {"percLessManaReserved","([0-9]+)% less Mana Reserved"},
        {"percEffectOfAuras","([0-9]+)% increased effect of Auras you Cast"},
        {"percRadiusOfAuras","([0-9]+)% increased Radius of Auras"},
		
		
			// Charges
        {"percMaxHPRegenPerEnduranceCharge","([0-9]+)% of maximum Life Regenerated per second per Endurance Charge"},
        {"percEnduranceChargeDuration","([0-9]+)% increased Endurance Charge Duration"},
        {"percPowerChargeDuration","([0-9]+)% increased Power Charge Duration"},
        {"flatMaxPowerCharge","\\+([0-9]+) Maximum Power Charge"},
        {"flatMaxFrenzyCharge","\\+([0-9]+) Maximum Frenzy Charge"},
        {"flatMaxEnduranceCharge","\\+([0-9]+) Maximum Endurance Charge"},
        {"percFrenzyChargeDuration","([0-9]+)% increased Frenzy Charge Duration"},
        {"percSpellDmgPerPowerCharge","([0-9]+)% increased Spell Damage per Power Charge"},
        {"percERPerFrenzyCharge","([0-9]+)% increased Evasion Rating per Frenzy Charge"},
        {"percLifeRegenPerEnduranceCharge","([0-9\\.]+)% of maximum Life Regenerated per second per Endurance Charge"},
		
		
		
			// Weapons
		
		
        {"flatMeleeWeaponAndUnarmedRange","\\+([0-9]+) to Melee Weapon and Unarmed range"},
		
        {"percEleDmgWithWeapons","([0-9]+)% increased Elemental Damage with Weapons"},
        {"percColdDmgWithWeapons","([0-9]+)% increased Cold Damage with Weapons"},
        {"percFireDmgWithWeapons","([0-9]+)% increased Fire Damage with Weapons"},
        {"percLightningDmgWithWeapons","([0-9]+)% increased Lightning Damage with Weapons"},
		
		
			// 1H Melee Weapons
        {"percPhysicalDmgWith1HWeapons","([0-9]+)% increased Physical Damage with One Handed Melee Weapons"},
        {"percASWith1HMeleeWeapons","([0-9]+)% increased Attack Speed with One Handed Melee Weapons"},
        {"percARWith1HMeleeWeapons","([0-9]+)% increased Accuracy Rating with One Handed Melee Weapons"},
        {"percCritChanceWith1HMeleeWeapons","([0-9]+)% increased Critical Strike Chance with One Handed Melee Weapons"},
        {"percCritMultiplierWith1HMeleeWeapon","([0-9]+)% increased Critical Strike Multiplier with One Handed Melee Weapons"},
		
		
			// Shields
        {"percEleResWhileHoldingShield","\\+([0-9]+)% Elemental Resistances while holding a Shield"},
        {"percBlockChanceWithShield","([0-9]+)% additional Chance to Block with Shields"},
        {"percESFromShield","([0-9]+)% increased Energy Shield from equipped Shield"},
        {"percDefencesFromShield","([0-9]+)% increased Defences from equipped Shield"},
		
        {"percChanceToBlockWhileDualWieldingOrHoldingShield","([0-9]+)% additional Chance to Block while Dual Wielding or holding a Shield"},
		
		
			// Dual Wielding
        {"percASWhileDualWielding","([0-9]+)% increased Attack Speed while Dual Wielding"},
        {"percPhysDmgWhileDualWielding","([0-9]+)% increased Physical Weapon Damage while Dual Wielding"},
        {"flatPercChanceToBlockWhileDualWielding","([0-9]+)% additional Chance to Block while Dual Wielding"},
        {"percWeaponCritChanceWhileDualWielding","([0-9]+)% increased Weapon Critical Strike Chance while Dual Wielding"},
        {"percARWhileDualWielding","([0-9]+)% increased Accuracy Rating while Dual Wielding"},
		
		
			// 2H Melee Weapons
        {"percPhysicalDmgWith2HWeapons","([0-9]+)% increased Physical Damage with Two Handed Melee Weapons"},
        {"percASWith2HWeapons","([0-9]+)% increased Attack Speed with Two Handed Melee Weapons"},
        {"percStunDurationWith2HWeapons","([0-9]+)% increased Stun Duration with Two Handed Melee Weapons on enemies"},
        {"percCritWith2HMeleeWeapons","([0-9]+)% increased Critical Strike Chance with Two Handed Melee Weapons"},
        {"percARWith2HMeleeWeapons","([0-9]+)% increased Accuracy Rating with Two Handed Melee Weapons"},
		
		
		
			// Axes
        {"percPhysicalDmgWithAxes","([0-9]+)% increased Physical Damage with Axes"},
        {"percARWithAxes","([0-9]+)% increased Accuracy Rating with Axes"},
        {"percASWithAxes","([0-9]+)% increased Attack Speed with Axes"},
		
		
			// Staves
        {"percGlobalCritMultiplierWithStaff","([0-9]+)% increased Global Critical Strike Multiplier while wielding a Staff"},
        {"percGlobalCritChanceWithStaff","([0-9]+)% increased Global Critical Strike Chance while wielding a Staff"},
        {"percPhysicalDmgWithStaves","([0-9]+)% increased Physical Damage with Staves"},
        {"percBlockChanceWithStaves","([0-9]+)% additional Block Chance With Staves"},
        {"percStunDurationWithStaves","([0-9]+)% increased Stun Duration with Staves on enemies"},
        {"percASWithStaves","([0-9]+)% increased Attack Speed with Staves"},
        {"percARWithStaves","([0-9]+)% increased Accuracy Rating with Staves"},
		
		
			// Bows
        {"percStunDurationWithBows","([0-9]+)% increased Stun Duration with Bows on enemies"},
        {"percPhysicalDmgWithBows","([0-9]+)% increased Physical Damage with Bows"},
        {"percARWithBows","([0-9]+)% increased Accuracy Rating with Bows"},
        {"percCritChanceWithBows","([0-9]+)% increased Critical Strike Chance with Bows"},
        {"percCritMultiplierWithBows","([0-9]+)% increased Critical Strike Multiplier with Bows"},
        {"percASWithBows","([0-9]+)% increased Attack Speed with Bows"},
        {"percArrowSpeed","([0-9]+)% increased Arrow Speed"},
        {"percChanceArrowPiercing","([0-9]+)% chance of Arrows Piercing"},

		
		
			// Claws
        {"percPhysicalDmgWithClaws","([0-9]+)% increased Physical Damage with Claws"},
        {"percPhysicalDmgLifeLeechWithClaws","([0-9]+)% of Physical Damage Dealt with Claws Leeched as Life"},
        {"percASWithClaws","([0-9]+)% increased Attack Speed with Claws"},
        {"percARWithClaws","([0-9]+)% increased Accuracy Rating with Claws"},
        {"percCritChanceWithClaws","([0-9]+)% increased Critical Strike Chance with Claws"},
		
		
			// Swords
        {"percReducedEnemyChanceToBlockSwordAttacks","([0-9]+)% reduced enemy chance to Block Sword Attacks"},
        {"percPhysicalDmgWithSwords","([0-9]+)% increased Physical Damage with Swords"},
        {"percCritMultiplierWithSwords","([0-9]+)% increased Critical Strike Multiplier with Swords"},
        {"percASWithSwords","([0-9]+)% increased Attack Speed with Swords"},
        {"percARWithSwords","([0-9]+)% increased Accuracy Rating with Swords"},
		
		
			// Daggers
        {"percPhysicalDmgWithDaggers","([0-9]+)% increased Physical Damage with Daggers"},
        {"percASWithDaggers","([0-9]+)% increased Attack Speed with Daggers"},
        {"percARWithDaggers","([0-9]+)% increased Accuracy Rating with Daggers"},
        {"percCritMultiplierWithDaggers","([0-9]+)% increased Critical Strike Multiplier with Daggers"},
        {"percCritChanceWithDaggers","([0-9]+)% increased Critical Strike Chance with Daggers"},
		
		
			// Maces
        {"percCritMultiplierWithMaces","([0-9]+)% increased Critical Strike Multiplier with Maces"},
        {"percASWithMaces","([0-9]+)% increased Attack Speed with Maces"},
        {"percARWithMaces","([0-9]+)% increased Accuracy Rating with Maces"},
        {"percPhysicalDmgWithMaces","([0-9]+)% increased Physical Damage with Maces"},
        {"percReducedStunThresholdWithMaces","([0-9]+)% reduced Enemy Stun Threshold with Maces"},
        {"percEleDmgWithMaces","([0-9]+)% increased Elemental Damage with Maces"},
		
		
			// Wands
        {"percEleDmgWithWands","([0-9]+)% increased Elemental Damage with Wands"},
        {"percWandDmgPerPowerCharge","([0-9]+)% increased Wand Damage per Power Charge"},
        {"percARWithWands","([0-9]+)% increased Accuracy Rating with Wands"},
        {"percPhysicalDmgWithWands","([0-9]+)% increased Physical Damage with Wands"},
        {"percWandPhysicalDmgAddedAsColdDmg","([0-9]+)% of Wand Physical Damage Added as Cold Damage"},
        {"percWandPhysicalDmgAddedAsFireDmg","([0-9]+)% of Wand Physical Damage Added as Fire Damage"},
        {"percWandPhysicalDmgAddedAsLightningDmg","([0-9]+)% of Wand Physical Damage Added as Lightning Damage"},
        {"percASWithWands","([0-9]+)% increased Attack Speed with Wands"},
		

		
			// Totems
        {"percCastSpeedForSummoningTotems","([0-9]+)% increased Casting Speed for Summoning Totems"},
        {"percTotemsEleResistances","Totems gain \\+([0-9]+)% to all Elemental Resistances"},
        {"percTotemDmg","([0-9]+)% increased Totem Damage"},
        {"percTotemPhysicalDmgReduction","Totems have ([0-9]+)% additional Physical Damage Reduction"},
        {"percTotemLife","([0-9]+)% increased Totem Life"},
        {"percTotemDuration","([0-9]+)% increased Totem Duration"},
        {"percTotemRange","([0-9]+)% increased Totem Range"},
        {"flatMaxTotem","Can summon up to ([0-9]+) additional totem"},
        {"percSpellCastTotemCastSpeed","Spells Cast by Totems have ([0-9]+)% increased Cast Speed"},
        {"percAttackTotemAS","Attacks used by Totems have ([0-9]+)% increased Attack Speed"},


			// Summoners / Traps / Mines
        {"percMinionDmg","Minions deal ([0-9]+)% increased Damage"},
        {"percMinionMaxLife","Minions have ([0-9]+)% increased maximum Life"},
        {"flatMaxNumberOfZombies","\\+([0-9]+) to Maximum number of Zombies"},
        {"flatMaxNumberOfSkeletons","\\+([0-9]+) to Maximum number of Skeletons"},
        {"flatMaxNumberOfSpectres","\\+([0-9]+) to Maximum number of Spectres"},

        {"flatMaxTrap","Can set up to ([0-9]+) additional trap"},
        {"percTrapDuration","([0-9]+)% increased Trap Duration"},
        {"percTrapThrowingSpeed","([0-9]+)% increased Trap Throwing Speed"},
        {"percTrapDmg","([0-9]+)% increased Trap Damage"},
        {"percTrapTriggerRadius","([0-9]+)% increased Trap Trigger Radius"},
        {"percTrapDmgEleResPenetration","Trap Damage Penetrates ([0-9]+)% Elemental Resistances"},

        {"flatMaxRemoteMine","Can set up to ([0-9]+) additional remote mine"},
        {"percMineLayingSpeed","([0-9]+)% increased Mine Laying Speed"},
        {"percMineDmg","([0-9]+)% increased Mine Damage"},
        {"percMineDuration","([0-9]+)% increased Mine Duration"},
        {"percMineDetonationRadius","([0-9]+)% increased Mine Detonation Radius"},
        {"percMineDmgEleResPenetration","Mine Damage Penetrates ([0-9]+)% Elemental Resistances"},

		
			// Flasks
        {"percFlaskRecoverySpeed","([0-9]+)% increased Flask Recovery Speed"},
        {"percLifeRecoveryFromFlasks","([0-9]+)% increased Life Recovery from Flasks"},
        {"percManaRecoveryFromFlasks","([0-9]+)% increased Mana Recovery from Flasks"},
        {"percFlaskEffects","([0-9]+)% increased effect of Flasks"},
        
        {"ironReflexes","Converts all Evasion Rating to Armour. Dexterity provides no bonus to Evasion Rating"},
//        {"","([0-9]+)"},
    };

    public static int perkCount = perkInit.length;

    public static BasePerk[] perkList = createPerkList();
    
    private static BasePerk[] createPerkList(){
        BasePerk[] l = new BasePerk[perkCount];
        for( int iperk = 0 ; iperk < perkCount ; iperk++ )
            l[iperk] = new BasePerk(iperk, perkInit[iperk][0], perkInit[iperk][1]);
        return l;
    }

}
