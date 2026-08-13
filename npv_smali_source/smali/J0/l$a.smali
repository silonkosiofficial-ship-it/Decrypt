.class final synthetic LJ0/l$a;
.super Ly7/a;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ0/l;->d(Landroid/view/View;LK0/q;Lm7/i;Ljava/util/function/Consumer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "add(Ljava/lang/Object;)Z"

    const/16 v6, 0x8

    const/4 v1, 0x1

    const-class v3, LX/b;

    const-string v4, "add"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Ly7/a;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/m;)V
    .locals 1

    iget-object v0, p0, Ly7/a;->C:Ljava/lang/Object;

    check-cast v0, LX/b;

    invoke-virtual {v0, p1}, LX/b;->d(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/m;

    invoke-virtual {p0, p1}, LJ0/l$a;->a(LJ0/m;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
