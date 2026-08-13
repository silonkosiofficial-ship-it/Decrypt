.class final LY2/a$b;
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
    name = "b"
.end annotation


# static fields
.field static final a:LY2/a$b;

.field private static final b:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LY2/a$b;

    invoke-direct {v0}, LY2/a$b;-><init>()V

    sput-object v0, LY2/a$b;->a:LY2/a$b;

    const-string v0, "storageMetrics"

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

    sput-object v0, LY2/a$b;->b:Lz5/c;

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

    check-cast p1, Lb3/b;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, LY2/a$b;->b(Lb3/b;Lz5/e;)V

    return-void
.end method

.method public b(Lb3/b;Lz5/e;)V
    .locals 1

    sget-object v0, LY2/a$b;->b:Lz5/c;

    invoke-virtual {p1}, Lb3/b;->a()Lb3/e;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    return-void
.end method
