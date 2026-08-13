.class public final synthetic Lv3/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field public final synthetic a:Lv3/E0;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lv3/E0;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/y0;->a:Lv3/E0;

    iput-object p2, p0, Lv3/y0;->b:Landroid/content/Context;

    iput-object p3, p0, Lv3/y0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lv3/y0;->a:Lv3/E0;

    iget-object v1, p0, Lv3/y0;->b:Landroid/content/Context;

    iget-object v2, p0, Lv3/y0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1, p2}, Lv3/E0;->L(Landroid/content/Context;Ljava/lang/String;Landroid/content/SharedPreferences;Ljava/lang/String;)V

    return-void
.end method
