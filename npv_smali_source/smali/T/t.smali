.class public final LT/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/j;


# instance fields
.field private final a:J

.field private final b:Ljava/util/Map;

.field private final c:LZ8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lz/j;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, LT/t;->a:J

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, LT/t;->b:Ljava/util/Map;

    invoke-interface {p1}, Lz/j;->b()LZ8/f;

    move-result-object p1

    new-instance p2, LT/t$a;

    invoke-direct {p2, p1, p0}, LT/t$a;-><init>(LZ8/f;LT/t;)V

    iput-object p2, p0, LT/t;->c:LZ8/f;

    return-void
.end method

.method public synthetic constructor <init>(Lz/j;JLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LT/t;-><init>(Lz/j;J)V

    return-void
.end method

.method public static final synthetic d(LT/t;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, LT/t;->b:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic e(LT/t;Lz/n$b;)Lz/n$b;
    .locals 0

    invoke-direct {p0, p1}, LT/t;->f(Lz/n$b;)Lz/n$b;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lz/n$b;)Lz/n$b;
    .locals 5

    new-instance v0, Lz/n$b;

    invoke-virtual {p1}, Lz/n$b;->a()J

    move-result-wide v1

    iget-wide v3, p0, LT/t;->a:J

    invoke-static {v1, v2, v3, v4}, Ln0/g;->q(JJ)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lz/n$b;-><init>(JLy7/k;)V

    return-object v0
.end method


# virtual methods
.method public b()LZ8/f;
    .locals 1

    iget-object v0, p0, LT/t;->c:LZ8/f;

    return-object v0
.end method
