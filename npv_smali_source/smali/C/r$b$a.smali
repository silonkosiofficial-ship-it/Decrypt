.class final LC/r$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/r$b;->a(LD/w;J)LC/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD/w;

.field final synthetic E:J

.field final synthetic F:I

.field final synthetic G:I


# direct methods
.method constructor <init>(LD/w;JII)V
    .locals 0

    iput-object p1, p0, LC/r$b$a;->D:LD/w;

    iput-wide p2, p0, LC/r$b$a;->E:J

    iput p4, p0, LC/r$b$a;->F:I

    iput p5, p0, LC/r$b$a;->G:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(IILx7/l;)LD0/K;
    .locals 4

    iget-object v0, p0, LC/r$b$a;->D:LD/w;

    iget-wide v1, p0, LC/r$b$a;->E:J

    iget v3, p0, LC/r$b$a;->F:I

    add-int/2addr p1, v3

    invoke-static {v1, v2, p1}, LY0/c;->i(JI)I

    move-result p1

    iget-wide v1, p0, LC/r$b$a;->E:J

    iget v3, p0, LC/r$b$a;->G:I

    add-int/2addr p2, v3

    invoke-static {v1, v2, p2}, LY0/c;->h(JI)I

    move-result p2

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, p1, p2, v1, p3}, LD0/M;->f0(IILjava/util/Map;Lx7/l;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lx7/l;

    invoke-virtual {p0, p1, p2, p3}, LC/r$b$a;->a(IILx7/l;)LD0/K;

    move-result-object p1

    return-object p1
.end method
