.class public abstract LT/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/Locale;

.field private final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/f;->a:Ljava/util/Locale;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LT/f;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public abstract a(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;
.end method

.method public abstract b(J)LT/e;
.end method

.method public abstract c(Ljava/util/Locale;)LT/k;
.end method

.method public abstract d()I
.end method

.method public final e()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LT/f;->b:Ljava/util/Map;

    return-object v0
.end method

.method public abstract f(II)LT/j;
.end method

.method public abstract g(J)LT/j;
.end method

.method public abstract h(LT/e;)LT/j;
.end method

.method public abstract i()LT/e;
.end method

.method public abstract j()Ljava/util/List;
.end method

.method public abstract k(Ljava/lang/String;Ljava/lang/String;)LT/e;
.end method

.method public abstract l(LT/j;I)LT/j;
.end method
