package com.halcyontek.paginlibrarysample

data class RedditApiResponse(val `data`: Data, val kind: String)

data class Data(val after: String, val before: Any, val children: List<Children>, val dist: Int, val modhash: String
)

data class Source(val height: Int, val url: String, val width: Int)

data class Children(val `data`: DataX, val kind: String)

class Gildings(
)

data class Image(val id: String, val resolutions: List<Resolution>, val source: Source, val variants: Variants
)
class MediaEmbed(
)

data class Preview(val enabled: Boolean, val images: List<Image>
)

data class Resolution(val height: Int, val url: String, val width: Int)
class SecureMediaEmbed(
)
class Variants(
)
data class DataX(val all_awardings: List<Any>, val allow_live_comments: Boolean, val approved_at_utc: Any, val approved_by: Any, val archived: Boolean, val author: String, val author_flair_background_color: String, val author_flair_css_class: String, val author_flair_richtext: List<Any>, val author_flair_template_id: Any, val author_flair_text: Any, val author_flair_text_color: String, val author_flair_type: String, val author_fullname: String, val author_patreon_flair: Boolean, val banned_at_utc: Any, val banned_by: Any, val can_gild: Boolean, val can_mod_post: Boolean, val category: Any,
    val clicked: Boolean,
    val content_categories: Any,
    val contest_mode: Boolean,
    val created: Double,
    val created_utc: Double,
    val discussion_type: Any,
    val distinguished: Any,
    val domain: String,
    val downs: Int,
    val edited: Boolean,
    val gilded: Int,
    val gildings: Gildings,
    val hidden: Boolean,
    val hide_score: Boolean,
    val id: String,
    val is_crosspostable: Boolean,
    val is_meta: Boolean,
    val is_original_content: Boolean,
    val is_reddit_media_domain: Boolean,
    val is_robot_indexable: Boolean,
    val is_self: Boolean,
    val is_video: Boolean,
    val likes: Any,
    val link_flair_background_color: String,
    val link_flair_css_class: Any,
    val link_flair_richtext: List<Any>,
    val link_flair_text: Any,
    val link_flair_text_color: String,
    val link_flair_type: String,
    val locked: Boolean,
    val media: Any,
    val media_embed: MediaEmbed,
    val media_only: Boolean,
    val mod_note: Any,
    val mod_reason_by: Any,
    val mod_reason_title: Any,
    val mod_reports: List<Any>,
    val name: String,
    val no_follow: Boolean,
    val num_comments: Int,
    val num_crossposts: Int,
    val num_reports: Any,
    val over_18: Boolean,
    val parent_whitelist_status: String,
    val permalink: String,
    val pinned: Boolean,
    val post_hint: String,
    val preview: Preview,
    val pwls: Int,
    val quarantine: Boolean,
    val removal_reason: Any,
    val report_reasons: Any,
    val saved: Boolean,
    val score: Int,
    val secure_media: Any,
    val secure_media_embed: SecureMediaEmbed,
    val selftext: String,
    val selftext_html: Any,
    val send_replies: Boolean,
    val spoiler: Boolean,
    val steward_reports: List<Any>,
    val stickied: Boolean,
    val subreddit: String,
    val subreddit_id: String,
    val subreddit_name_prefixed: String,
    val subreddit_subscribers: Int,
    val subreddit_type: String,
    val suggested_sort: String,
    val thumbnail: String,
    val thumbnail_height: Int,
    val thumbnail_width: Int,
    val title: String,
    val total_awards_received: Int,
    val ups: Int,
    val url: String,
    val user_reports: List<Any>,
    val view_count: Any,
    val visited: Boolean,
    val whitelist_status: String,
    val wls: Int
)