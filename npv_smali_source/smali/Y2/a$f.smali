.class final LY2/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation


# static fields
.field static final a:LY2/a$f;

.field private static final b:Lz5/c;

.field private static final c:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LY2/a$f;

    invoke-direct {v0}, LY2/a$f;-><init>()V

    sput-object v0, LY2/a$f;->a:LY2/a$f;

    const-string v0, "currentCacheSizeBytes"

    invoke-static {v0}, Lz5/c;->a(Ljava/lang/String;)Lz5/c$b;

    move-result-object v0

    invoke-static {}, LC5/a;->b()LC5/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, LC5/a;->c(I)LC5/a;

    move-result-object v1

    invoke-virtual {v1}, LC5/a;->a()LC5/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz5/c$b;->b(Ljava/lang/annotation/Annotation;)Lz5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lz5/c$b;->a()Lz5/c;

    move-result-object v0

    sput-object v0, LY2/a$f;->b:Lz5/c;

    const-string v0, "maxCacheSizeBytes"

    invoke-static {v0}, Lz5/c;->a(Ljava/lang/String;)Lz5/c$b;

    move-result-object v0

    invoke-static {}, LC5/a;->b()LC5/a;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, LC5/a;->c(I)LC5/a;

    move-result-object v1

    invoke-virtual {v1}, LC5/a;->a()LC5/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz5/c$b;->b(Ljava/lang/annotation/Annotation;)Lz5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lz5/c$b;->a()Lz5/c;

    move-result-object v0

    sput-object v0, LY2/a$f;->c:Lz5/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lb3/e;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, LY2/a$f;->b(Lb3/e;Lz5/e;)V

    return-void
.end method

.method public b(Lb3/e;Lz5/e;)V
    .locals 3

    sget-object v0, LY2/a$f;->b:Lz5/c;

    invoke-virtual {p1}, Lb3/e;->a()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lz5/e;->a(Lz5/c;J)Lz5/e;

    sget-object v0, LY2/a$f;->c:Lz5/c;

    invoke-virtual {p1}, Lb3/e;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lz5/e;->a(Lz5/c;J)Lz5/e;

    return-void
.end method
