.class final LN/y$c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/y$c;->e(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/G1;


# direct methods
.method constructor <init>(LV/G1;)V
    .locals 0

    iput-object p1, p0, LN/y$c$a;->D:LV/G1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, LN/y$c$a;->D:LV/G1;

    invoke-static {v0}, LN/y$c;->a(LV/G1;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LN/y$c$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->d(J)Ln0/g;

    move-result-object v0

    return-object v0
.end method
