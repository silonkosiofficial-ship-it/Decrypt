.class final LY2/a$e;
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
    name = "e"
.end annotation


# static fields
.field static final a:LY2/a$e;

.field private static final b:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LY2/a$e;

    invoke-direct {v0}, LY2/a$e;-><init>()V

    sput-object v0, LY2/a$e;->a:LY2/a$e;

    const-string v0, "clientMetrics"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, LY2/a$e;->b:Lz5/c;

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

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    check-cast p2, Lz5/e;

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p2}, LY2/a$e;->b(LY2/m;Lz5/e;)V

    return-void
.end method

.method public b(LY2/m;Lz5/e;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
