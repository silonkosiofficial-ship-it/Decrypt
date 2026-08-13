.class final LS/b$e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/b$e;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;

.field final synthetic E:Lx7/p;


# direct methods
.method constructor <init>(Lx7/p;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LS/b$e$a;->D:Lx7/p;

    iput-object p2, p0, LS/b$e$a;->E:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 5

    .prologue
    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LV/n;->A()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:254)"

    const v2, 0x455a457c

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, LS/b;->f()F

    move-result p2

    invoke-static {}, LS/b;->e()F

    move-result v0

    new-instance v1, LS/b$e$a$a;

    iget-object v2, p0, LS/b$e$a;->D:Lx7/p;

    iget-object v3, p0, LS/b$e$a;->E:Lx7/p;

    invoke-direct {v1, v2, v3}, LS/b$e$a$a;-><init>(Lx7/p;Lx7/p;)V

    const/16 v2, 0x36

    const v3, 0x707b6565

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, p1, v2}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v1

    const/16 v2, 0x1b6

    invoke-static {p2, v0, v1, p1, v2}, LS/b;->b(FFLx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/b$e$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
