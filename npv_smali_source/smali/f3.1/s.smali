.class public final Lf3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/b;


# instance fields
.field private final a:Lh7/a;

.field private final b:Lh7/a;

.field private final c:Lh7/a;

.field private final d:Lh7/a;

.field private final e:Lh7/a;

.field private final f:Lh7/a;

.field private final g:Lh7/a;

.field private final h:Lh7/a;

.field private final i:Lh7/a;


# direct methods
.method public constructor <init>(Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/s;->a:Lh7/a;

    iput-object p2, p0, Lf3/s;->b:Lh7/a;

    iput-object p3, p0, Lf3/s;->c:Lh7/a;

    iput-object p4, p0, Lf3/s;->d:Lh7/a;

    iput-object p5, p0, Lf3/s;->e:Lh7/a;

    iput-object p6, p0, Lf3/s;->f:Lh7/a;

    iput-object p7, p0, Lf3/s;->g:Lh7/a;

    iput-object p8, p0, Lf3/s;->h:Lh7/a;

    iput-object p9, p0, Lf3/s;->i:Lh7/a;

    return-void
.end method

.method public static a(Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;)Lf3/s;
    .locals 11

    new-instance v10, Lf3/s;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lf3/s;-><init>(Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;)V

    return-object v10
.end method

.method public static c(Landroid/content/Context;LZ2/e;Lg3/d;Lf3/x;Ljava/util/concurrent/Executor;Lh3/b;Li3/a;Li3/a;Lg3/c;)Lf3/r;
    .locals 11

    new-instance v10, Lf3/r;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lf3/r;-><init>(Landroid/content/Context;LZ2/e;Lg3/d;Lf3/x;Ljava/util/concurrent/Executor;Lh3/b;Li3/a;Li3/a;Lg3/c;)V

    return-object v10
.end method


# virtual methods
.method public b()Lf3/r;
    .locals 10

    iget-object v0, p0, Lf3/s;->a:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lf3/s;->b:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LZ2/e;

    iget-object v0, p0, Lf3/s;->c:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lg3/d;

    iget-object v0, p0, Lf3/s;->d:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lf3/x;

    iget-object v0, p0, Lf3/s;->e:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lf3/s;->f:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lh3/b;

    iget-object v0, p0, Lf3/s;->g:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Li3/a;

    iget-object v0, p0, Lf3/s;->h:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Li3/a;

    iget-object v0, p0, Lf3/s;->i:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lg3/c;

    invoke-static/range {v1 .. v9}, Lf3/s;->c(Landroid/content/Context;LZ2/e;Lg3/d;Lf3/x;Ljava/util/concurrent/Executor;Lh3/b;Li3/a;Li3/a;Lg3/c;)Lf3/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf3/s;->b()Lf3/r;

    move-result-object v0

    return-object v0
.end method
