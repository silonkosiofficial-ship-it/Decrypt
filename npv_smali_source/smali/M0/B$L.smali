.class final LM0/B$L;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM0/B$L;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$L;

    invoke-direct {v0}, LM0/B$L;-><init>()V

    sput-object v0, LM0/B$L;->D:LM0/B$L;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;J)Ljava/lang/Object;
    .locals 2

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Integer;

    invoke-static {p2, p3}, LM0/N;->n(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p1, v1

    invoke-static {p2, p3}, LM0/N;->i(J)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x1

    aput-object p2, p1, p3

    invoke-static {p1}, Lj7/v;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Le0/l;

    check-cast p2, LM0/N;

    invoke-virtual {p2}, LM0/N;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LM0/B$L;->a(Le0/l;J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
