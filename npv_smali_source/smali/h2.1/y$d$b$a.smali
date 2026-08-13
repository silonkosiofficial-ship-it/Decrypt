.class final synthetic Lh2/y$d$b$a;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/y$d$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "refresh()V"

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-class v3, Lh2/y;

    const-string v4, "refresh"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Ly7/q;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh2/y$d$b$a;->s()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method public final s()V
    .locals 1

    iget-object v0, p0, Ly7/f;->D:Ljava/lang/Object;

    check-cast v0, Lh2/y;

    invoke-virtual {v0}, Lh2/y;->l()V

    return-void
.end method
