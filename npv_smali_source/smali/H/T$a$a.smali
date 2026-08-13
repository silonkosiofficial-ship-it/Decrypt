.class final LH/T$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/T$a;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/S;


# direct methods
.method constructor <init>(LH/S;)V
    .locals 0

    iput-object p1, p0, LH/T$a$a;->D:LH/S;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/M;LD0/G;J)LD0/K;
    .locals 14

    move-object v0, p0

    iget-object v1, v0, LH/T$a$a;->D:LH/S;

    invoke-virtual {v1}, LH/S;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/t;->g(J)I

    move-result v3

    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v4

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v5

    invoke-static {v3, v4, v5}, LE7/j;->k(III)I

    move-result v8

    invoke-static {v1, v2}, LY0/t;->f(J)I

    move-result v1

    invoke-static/range {p3 .. p4}, LY0/b;->m(J)I

    move-result v2

    invoke-static/range {p3 .. p4}, LY0/b;->k(J)I

    move-result v3

    invoke-static {v1, v2, v3}, LE7/j;->k(III)I

    move-result v10

    const/16 v12, 0xa

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-wide/from16 v6, p3

    invoke-static/range {v6 .. v13}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v1

    move-object/from16 v3, p2

    invoke-interface {v3, v1, v2}, LD0/G;->U(J)LD0/X;

    move-result-object v1

    invoke-virtual {v1}, LD0/X;->I0()I

    move-result v3

    invoke-virtual {v1}, LD0/X;->w0()I

    move-result v4

    new-instance v6, LH/T$a$a$a;

    invoke-direct {v6, v1}, LH/T$a$a$a;-><init>(LD0/X;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LD0/M;

    check-cast p2, LD0/G;

    check-cast p3, LY0/b;

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, LH/T$a$a;->a(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    return-object p1
.end method
