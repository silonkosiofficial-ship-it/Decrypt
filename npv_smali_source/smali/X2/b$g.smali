.class final LX2/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation


# static fields
.field static final a:LX2/b$g;

.field private static final b:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LX2/b$g;

    invoke-direct {v0}, LX2/b$g;-><init>()V

    sput-object v0, LX2/b$g;->a:LX2/b$g;

    const-string v0, "prequest"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LX2/b$g;->b:Lz5/c;

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

    check-cast p1, LX2/s;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, LX2/b$g;->b(LX2/s;Lz5/e;)V

    return-void
.end method

.method public b(LX2/s;Lz5/e;)V
    .locals 1

    sget-object v0, LX2/b$g;->b:Lz5/c;

    invoke-virtual {p1}, LX2/s;->b()LX2/r;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    return-void
.end method
