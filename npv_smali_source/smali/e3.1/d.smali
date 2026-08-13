.class public final Le3/d;
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


# direct methods
.method public constructor <init>(Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/d;->a:Lh7/a;

    iput-object p2, p0, Le3/d;->b:Lh7/a;

    iput-object p3, p0, Le3/d;->c:Lh7/a;

    iput-object p4, p0, Le3/d;->d:Lh7/a;

    iput-object p5, p0, Le3/d;->e:Lh7/a;

    return-void
.end method

.method public static a(Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;)Le3/d;
    .locals 7

    new-instance v6, Le3/d;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Le3/d;-><init>(Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;)V

    return-object v6
.end method

.method public static c(Ljava/util/concurrent/Executor;LZ2/e;Lf3/x;Lg3/d;Lh3/b;)Le3/c;
    .locals 7

    new-instance v6, Le3/c;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Le3/c;-><init>(Ljava/util/concurrent/Executor;LZ2/e;Lf3/x;Lg3/d;Lh3/b;)V

    return-object v6
.end method


# virtual methods
.method public b()Le3/c;
    .locals 5

    iget-object v0, p0, Le3/d;->a:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Le3/d;->b:Lh7/a;

    invoke-interface {v1}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZ2/e;

    iget-object v2, p0, Le3/d;->c:Lh7/a;

    invoke-interface {v2}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf3/x;

    iget-object v3, p0, Le3/d;->d:Lh7/a;

    invoke-interface {v3}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg3/d;

    iget-object v4, p0, Le3/d;->e:Lh7/a;

    invoke-interface {v4}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh3/b;

    invoke-static {v0, v1, v2, v3, v4}, Le3/d;->c(Ljava/util/concurrent/Executor;LZ2/e;Lf3/x;Lg3/d;Lh3/b;)Le3/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le3/d;->b()Le3/c;

    move-result-object v0

    return-object v0
.end method
