.class public Lp8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp8/g$a;
    }
.end annotation


# static fields
.field private static final b:Lp8/g;


# instance fields
.field private final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp8/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lp8/g;-><init>(Z)V

    sput-object v0, Lp8/g;->b:Lp8/g;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lp8/g;->a:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lp8/g;->a:Ljava/util/Map;

    return-void
.end method

.method public static c()Lp8/g;
    .locals 1

    sget-object v0, Lp8/g;->b:Lp8/g;

    return-object v0
.end method

.method public static d()Lp8/g;
    .locals 1

    new-instance v0, Lp8/g;

    invoke-direct {v0}, Lp8/g;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final a(Lp8/i$f;)V
    .locals 4

    iget-object v0, p0, Lp8/g;->a:Ljava/util/Map;

    new-instance v1, Lp8/g$a;

    invoke-virtual {p1}, Lp8/i$f;->b()Lp8/p;

    move-result-object v2

    invoke-virtual {p1}, Lp8/i$f;->d()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lp8/g$a;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b(Lp8/p;I)Lp8/i$f;
    .locals 2

    iget-object v0, p0, Lp8/g;->a:Ljava/util/Map;

    new-instance v1, Lp8/g$a;

    invoke-direct {v1, p1, p2}, Lp8/g$a;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp8/i$f;

    return-object p1
.end method
