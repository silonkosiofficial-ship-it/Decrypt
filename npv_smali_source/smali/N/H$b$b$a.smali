.class final LN/H$b$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/H$b$b;->a(Lx7/a;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/a;


# direct methods
.method constructor <init>(Lx7/a;)V
    .locals 0

    iput-object p1, p0, LN/H$b$b$a;->D:Lx7/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LY0/e;)J
    .locals 2

    iget-object p1, p0, LN/H$b$b$a;->D:Lx7/a;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/g;

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/e;

    invoke-virtual {p0, p1}, LN/H$b$b$a;->a(LY0/e;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->d(J)Ln0/g;

    move-result-object p1

    return-object p1
.end method
