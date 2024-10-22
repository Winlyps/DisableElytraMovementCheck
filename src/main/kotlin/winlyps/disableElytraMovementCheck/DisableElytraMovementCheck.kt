package winlyps.disableElytraMovementCheck

import org.bukkit.plugin.java.JavaPlugin

class DisableElytraMovementCheck : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("disableElytraMovementCheck", "true")
        }
        logger.info("DisableElytraMovementCheck plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("DisableElytraMovementCheck plugin has been disabled.")
    }
}