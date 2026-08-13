.class final LS/V$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/V$a;->a(LS/P0;Ljava/util/Locale;)Le0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/V$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/V$a$a;

    invoke-direct {v0}, LS/V$a$a;-><init>()V

    sput-object v0, LS/V$a$a;->D:LS/V$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;LS/V;)Ljava/util/List;
    .locals 5

    invoke-virtual {p2}, LS/V;->f()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p2}, LS/h;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2}, LS/h;->g()LE7/i;

    move-result-object v1

    invoke-virtual {v1}, LE7/g;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p2}, LS/h;->g()LE7/i;

    move-result-object v2

    invoke-virtual {v2}, LE7/g;->g()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2}, LS/V;->b()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 p1, 0x1

    aput-object v0, v3, p1

    const/4 p1, 0x2

    aput-object v1, v3, p1

    const/4 p1, 0x3

    aput-object v2, v3, p1

    const/4 p1, 0x4

    aput-object p2, v3, p1

    invoke-static {v3}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le0/l;

    check-cast p2, LS/V;

    invoke-virtual {p0, p1, p2}, LS/V$a$a;->a(Le0/l;LS/V;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
