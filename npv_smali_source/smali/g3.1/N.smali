.class public final Lg3/N;
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

    iput-object p1, p0, Lg3/N;->a:Lh7/a;

    iput-object p2, p0, Lg3/N;->b:Lh7/a;

    iput-object p3, p0, Lg3/N;->c:Lh7/a;

    iput-object p4, p0, Lg3/N;->d:Lh7/a;

    iput-object p5, p0, Lg3/N;->e:Lh7/a;

    return-void
.end method

.method public static a(Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;)Lg3/N;
    .locals 7

    new-instance v6, Lg3/N;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lg3/N;-><init>(Lh7/a;Lh7/a;Lh7/a;Lh7/a;Lh7/a;)V

    return-object v6
.end method

.method public static c(Li3/a;Li3/a;Ljava/lang/Object;Ljava/lang/Object;Lh7/a;)Lg3/M;
    .locals 7

    new-instance v6, Lg3/M;

    move-object v3, p2

    check-cast v3, Lg3/e;

    move-object v4, p3

    check-cast v4, Lg3/W;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lg3/M;-><init>(Li3/a;Li3/a;Lg3/e;Lg3/W;Lh7/a;)V

    return-object v6
.end method


# virtual methods
.method public b()Lg3/M;
    .locals 5

    iget-object v0, p0, Lg3/N;->a:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li3/a;

    iget-object v1, p0, Lg3/N;->b:Lh7/a;

    invoke-interface {v1}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li3/a;

    iget-object v2, p0, Lg3/N;->c:Lh7/a;

    invoke-interface {v2}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lg3/N;->d:Lh7/a;

    invoke-interface {v3}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lg3/N;->e:Lh7/a;

    invoke-static {v0, v1, v2, v3, v4}, Lg3/N;->c(Li3/a;Li3/a;Ljava/lang/Object;Ljava/lang/Object;Lh7/a;)Lg3/M;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg3/N;->b()Lg3/M;

    move-result-object v0

    return-object v0
.end method
