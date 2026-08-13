.class final Landroidx/room/c$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/c;-><init>(Lo2/n;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/room/c;


# direct methods
.method constructor <init>(Landroidx/room/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/c$e;->D:Landroidx/room/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/room/c$e;->D:Landroidx/room/c;

    invoke-static {v0}, Landroidx/room/c;->a(Landroidx/room/c;)Lv2/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lv2/b;->g()V

    :cond_0
    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/room/c$e;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
