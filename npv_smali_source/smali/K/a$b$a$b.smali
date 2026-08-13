.class final synthetic LK/a$b$a$b;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/a$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# instance fields
.field final synthetic L:LK/q0$a;


# direct methods
.method constructor <init>(LK/q0$a;)V
    .locals 6

    iput-object p1, p0, LK/a$b$a$b;->L:LK/q0$a;

    const-string v4, "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Ly7/t$a;

    const-string v3, "localToScreen"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ly7/q;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/J1;

    invoke-virtual {p1}, Lo0/J1;->r()[F

    move-result-object p1

    invoke-virtual {p0, p1}, LK/a$b$a$b;->s([F)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final s([F)V
    .locals 1

    iget-object v0, p0, LK/a$b$a$b;->L:LK/q0$a;

    invoke-static {v0, p1}, LK/a;->o(LK/q0$a;[F)V

    return-void
.end method
