.class final Ld0/b$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld0/b;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LV/n;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ld0/b;

.field final synthetic E:Ljava/lang/Object;

.field final synthetic F:Ljava/lang/Object;

.field final synthetic G:Ljava/lang/Object;

.field final synthetic H:I


# direct methods
.method constructor <init>(Ld0/b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput-object p1, p0, Ld0/b$c;->D:Ld0/b;

    iput-object p2, p0, Ld0/b$c;->E:Ljava/lang/Object;

    iput-object p3, p0, Ld0/b$c;->F:Ljava/lang/Object;

    iput-object p4, p0, Ld0/b$c;->G:Ljava/lang/Object;

    iput p5, p0, Ld0/b$c;->H:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 6

    iget-object v0, p0, Ld0/b$c;->D:Ld0/b;

    iget-object v1, p0, Ld0/b$c;->E:Ljava/lang/Object;

    iget-object v2, p0, Ld0/b$c;->F:Ljava/lang/Object;

    iget-object v3, p0, Ld0/b$c;->G:Ljava/lang/Object;

    iget p2, p0, Ld0/b$c;->H:I

    invoke-static {p2}, LV/S0;->a(I)I

    move-result p2

    or-int/lit8 v5, p2, 0x1

    move-object v4, p1

    invoke-virtual/range {v0 .. v5}, Ld0/b;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LV/n;I)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ld0/b$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
