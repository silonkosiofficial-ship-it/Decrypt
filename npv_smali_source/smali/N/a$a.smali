.class final LN/a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/a;->a(LN/i;Lh0/c;Lx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN/i;

.field final synthetic E:Lh0/c;

.field final synthetic F:Lx7/p;

.field final synthetic G:I


# direct methods
.method constructor <init>(LN/i;Lh0/c;Lx7/p;I)V
    .locals 0

    iput-object p1, p0, LN/a$a;->D:LN/i;

    iput-object p2, p0, LN/a$a;->E:Lh0/c;

    iput-object p3, p0, LN/a$a;->F:Lx7/p;

    iput p4, p0, LN/a$a;->G:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 3

    iget-object p2, p0, LN/a$a;->D:LN/i;

    iget-object v0, p0, LN/a$a;->E:Lh0/c;

    iget-object v1, p0, LN/a$a;->F:Lx7/p;

    iget v2, p0, LN/a$a;->G:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, LV/S0;->a(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, LN/a;->a(LN/i;Lh0/c;Lx7/p;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/a$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
