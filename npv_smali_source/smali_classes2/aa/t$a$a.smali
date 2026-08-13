.class final Laa/t$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/t$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Laa/t$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laa/t$a$a;

    invoke-direct {v0}, Laa/t$a$a;-><init>()V

    sput-object v0, Laa/t$a$a;->D:Laa/t$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/content/res/AssetManager;
    .locals 2

    .prologue
    invoke-static {}, Lorg/jetbrains/compose/resources/a;->b()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Android context is not initialized. If it happens in the Preview mode then call PreviewContextConfigurationEffect() function."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laa/t$a$a;->a()Landroid/content/res/AssetManager;

    move-result-object v0

    return-object v0
.end method
