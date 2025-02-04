package org.maxgamer.quickshop.Shop;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface Shop {
    /**
     * Add x ItemStack to the shop inventory
     *
     * @param paramItemStack The ItemStack you want add
     * @param paramInt       How many you want add
     */
    void add(ItemStack paramItemStack, int paramInt);

    /**
     * Add new staff to the moderators
     *
     * @param player New staff
     * @return Success
     */
    boolean addStaff(UUID player);

    /**
     * Execute buy action for player with x items.
     *
     * @param paramPlayer Target player
     * @param paramInt    How many buyed?
     */
    void buy(Player paramPlayer, int paramInt);

    /**
     * Check the display location, and teleport, respawn if needs.
     */
    void checkDisplay();

    /**
     * Empty moderators team.
     */
    void clearStaffs();

    /**
     * Clone new shop object.
     * Not a deep clone.
     *
     * @return New shop object
     */
    Shop clone();

    /**
     * Remove a staff from moderators
     *
     * @param player Staff
     * @return Success
     */
    boolean delStaff(UUID player);

    /**
     * Delete shop from ram, and database.
     */
    void delete();

    /**
     * Delete shop from ram or ram and database
     *
     * @param paramBoolean true = only delete from ram, false = delete from both ram and database
     */
    void delete(boolean paramBoolean);

    /**
     * Check shop is or not attacked the target block
     *
     * @param paramBlock Target block
     * @return isAttached
     */
    boolean isAttached(Block paramBlock);

    /**
     * Check the target ItemStack is matches with this shop's item.
     *
     * @param paramItemStack Target ItemStack.
     * @return Matches
     */
    boolean matches(ItemStack paramItemStack);

    /**
     * Execute codes when player click the shop will did things
     */
    void onClick();

    /**
     * Load shop to the world
     */
    void onLoad();

    /**
     * Unload shop from world
     */
    void onUnload();

    /**
     * Get shop's owner name, it will return owner name or Admin Shop(i18n) when it is unlimited
     *
     * @return owner name
     */
    String ownerName();

    /**
     * Remove x ItemStack from the shop inventory
     *
     * @param paramItemStack Want removed ItemStack
     * @param paramInt       Want remove how many
     */
    void remove(ItemStack paramItemStack, int paramInt);

    /**
     * Execute sell action for player with x items.
     *
     * @param paramPlayer Target player
     * @param paramInt    How many sold?
     */
    void sell(Player paramPlayer, int paramInt);

    /**
     * Generate new sign texts on shop's sign.
     */
    void setSignText();

    /**
     * Update shop data to database
     */
    void update();

    /**
     * Set new shop type for this shop
     *
     * @param paramShopType New shop type
     */
    void setShopType(ShopType paramShopType);

    /**
     * Get shop's item durability, if have.
     *
     * @return Shop's item durability
     */
    short getDurability();

    /**
     * Get shop item's ItemStack
     *
     * @return The shop's ItemStack
     */
    ItemStack getItem();

    /**
     * Set texts on shop's sign
     *
     * @param paramArrayOfString The texts you want set
     */
    void setSignText(String[] paramArrayOfString);

    /**
     * Get shop's location
     *
     * @return Shop's location
     */
    Location getLocation();

    /**
     * Return this shop's moderators
     *
     * @return Shop moderators
     */
    ShopModerator getModerator();

    /**
     * Set new shop's moderators
     *
     * @param shopModerator New moderators team you want set
     */
    void setModerator(ShopModerator shopModerator);

    /**
     * Get shop's owner UUID
     *
     * @return Shop's owner UUID, can use Bukkit.getOfflinePlayer to convert to the OfflinePlayer.
     */
    UUID getOwner();

    /**
     * Set new owner to the shop's owner
     *
     * @param paramString New owner UUID
     */
    void setOwner(UUID paramString);

    /**
     * Get shop's price
     *
     * @return Price
     */
    double getPrice();

    /**
     * Set shop's new price
     *
     * @param paramDouble New price
     */
    void setPrice(double paramDouble);

    /**
     * Get shop remaining space.
     *
     * @return Remaining space.
     */
    int getRemainingSpace();

    /**
     * Get shop remaining stock.
     *
     * @return Remaining stock.
     */
    int getRemainingStock();

    /**
     * Get shop type
     *
     * @return shop type
     */
    ShopType getShopType();

    /**
     * Get shop signs, may have multi signs
     *
     * @return Signs for the shop
     */
    List<Sign> getSigns();

    /**
     * Directly get all staffs.
     *
     * @return staffs
     */
    ArrayList<UUID> getStaffs();

    /**
     * Get shop is or not in buying mode
     *
     * @return yes or no
     */
    boolean isBuying();

    /**
     * Get this container shop is loaded or unloaded.
     *
     * @return Loaded
     */
    boolean isLoaded();

    /**
     * Get shop is or not in selling mode
     *
     * @return yes or no
     */
    boolean isSelling();

    /**
     * Get shop is or not in Unlimited Mode (Admin Shop)
     *
     * @return yes or not
     */
    boolean isUnlimited();

    /**
     * Set shop is or not Unlimited Mode (Admin Shop)
     *
     * @param paramBoolean status
     */
    void setUnlimited(boolean paramBoolean);

    /**
     * Shop is valid
     *
     * @return status
     */
    boolean isValid();


}