.class final Landroidx/room/c$a;
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

    iput-object p1, p0, Landroidx/room/c$a;->D:Landroidx/room/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/room/c$a;->D:Landroidx/room/c;

    invoke-virtual {v0}, Landroidx/room/c;->i()Lo2/n;

    move-result-object v0

    invoke-virtual {v0}, Lo2/n;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/room/c$a;->D:Landroidx/room/c;

    invoke-virtual {v0}, Landroidx/room/c;->i()Lo2/n;

    move-result-object v0

    invoke-virtual {v0}, Lo2/n;->K()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/room/c$a;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
