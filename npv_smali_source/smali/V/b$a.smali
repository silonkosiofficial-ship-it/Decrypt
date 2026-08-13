.class final LV/b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LV/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV/b$a;

    invoke-direct {v0}, LV/b$a;-><init>()V

    sput-object v0, LV/b$a;->D:LV/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LV/j0;
    .locals 1

    .prologue
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, LV/H;->C:LV/H;

    goto :goto_0

    :cond_0
    sget-object v0, LV/f1;->C:LV/f1;

    :goto_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LV/b$a;->a()LV/j0;

    move-result-object v0

    return-object v0
.end method
