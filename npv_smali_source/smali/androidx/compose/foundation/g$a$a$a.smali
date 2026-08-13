.class final Landroidx/compose/foundation/g$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/g$a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Ly7/M;

.field final synthetic D:Ly7/M;

.field final synthetic E:Ly7/M;

.field final synthetic F:Landroidx/compose/foundation/g$a;


# direct methods
.method constructor <init>(Ly7/M;Ly7/M;Ly7/M;Landroidx/compose/foundation/g$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->C:Ly7/M;

    iput-object p2, p0, Landroidx/compose/foundation/g$a$a$a;->D:Ly7/M;

    iput-object p3, p0, Landroidx/compose/foundation/g$a$a$a;->E:Ly7/M;

    iput-object p4, p0, Landroidx/compose/foundation/g$a$a$a;->F:Landroidx/compose/foundation/g$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/i;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/g$a$a$a;->b(Lz/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lz/i;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of p2, p1, Lz/n$b;

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->C:Ly7/M;

    :goto_0
    iget p2, p1, Ly7/M;->C:I

    add-int/2addr p2, v0

    :goto_1
    iput p2, p1, Ly7/M;->C:I

    goto :goto_4

    :cond_0
    instance-of p2, p1, Lz/n$c;

    if-eqz p2, :cond_1

    :goto_2
    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->C:Ly7/M;

    :goto_3
    iget p2, p1, Ly7/M;->C:I

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_1
    instance-of p2, p1, Lz/n$a;

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    instance-of p2, p1, Lz/g;

    if-eqz p2, :cond_3

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->D:Ly7/M;

    goto :goto_0

    :cond_3
    instance-of p2, p1, Lz/h;

    if-eqz p2, :cond_4

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->D:Ly7/M;

    goto :goto_3

    :cond_4
    instance-of p2, p1, Lz/d;

    if-eqz p2, :cond_5

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->E:Ly7/M;

    goto :goto_0

    :cond_5
    instance-of p1, p1, Lz/e;

    if-eqz p1, :cond_6

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->E:Ly7/M;

    goto :goto_3

    :cond_6
    :goto_4
    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->C:Ly7/M;

    iget p1, p1, Ly7/M;->C:I

    const/4 p2, 0x0

    if-lez p1, :cond_7

    move p1, v0

    goto :goto_5

    :cond_7
    move p1, p2

    :goto_5
    iget-object v1, p0, Landroidx/compose/foundation/g$a$a$a;->D:Ly7/M;

    iget v1, v1, Ly7/M;->C:I

    if-lez v1, :cond_8

    move v1, v0

    goto :goto_6

    :cond_8
    move v1, p2

    :goto_6
    iget-object v2, p0, Landroidx/compose/foundation/g$a$a$a;->E:Ly7/M;

    iget v2, v2, Ly7/M;->C:I

    if-lez v2, :cond_9

    move v2, v0

    goto :goto_7

    :cond_9
    move v2, p2

    :goto_7
    iget-object v3, p0, Landroidx/compose/foundation/g$a$a$a;->F:Landroidx/compose/foundation/g$a;

    invoke-static {v3}, Landroidx/compose/foundation/g$a;->W1(Landroidx/compose/foundation/g$a;)Z

    move-result v3

    if-eq v3, p1, :cond_a

    iget-object p2, p0, Landroidx/compose/foundation/g$a$a$a;->F:Landroidx/compose/foundation/g$a;

    invoke-static {p2, p1}, Landroidx/compose/foundation/g$a;->Z1(Landroidx/compose/foundation/g$a;Z)V

    move p2, v0

    :cond_a
    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->F:Landroidx/compose/foundation/g$a;

    invoke-static {p1}, Landroidx/compose/foundation/g$a;->V1(Landroidx/compose/foundation/g$a;)Z

    move-result p1

    if-eq p1, v1, :cond_b

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->F:Landroidx/compose/foundation/g$a;

    invoke-static {p1, v1}, Landroidx/compose/foundation/g$a;->Y1(Landroidx/compose/foundation/g$a;Z)V

    move p2, v0

    :cond_b
    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->F:Landroidx/compose/foundation/g$a;

    invoke-static {p1}, Landroidx/compose/foundation/g$a;->U1(Landroidx/compose/foundation/g$a;)Z

    move-result p1

    if-eq p1, v2, :cond_c

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->F:Landroidx/compose/foundation/g$a;

    invoke-static {p1, v2}, Landroidx/compose/foundation/g$a;->X1(Landroidx/compose/foundation/g$a;Z)V

    goto :goto_8

    :cond_c
    move v0, p2

    :goto_8
    if-eqz v0, :cond_d

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->F:Landroidx/compose/foundation/g$a;

    invoke-static {p1}, LF0/t;->a(LF0/s;)V

    :cond_d
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
