.class public final LX0/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX0/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX0/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final b:LX0/o$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LX0/o$b;

    invoke-direct {v0}, LX0/o$b;-><init>()V

    sput-object v0, LX0/o$b;->b:LX0/o$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0
.end method

.method public c()J
    .locals 2

    sget-object v0, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v0}, Lo0/y0$a;->g()J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic d(Lx7/a;)LX0/o;
    .locals 0

    invoke-static {p0, p1}, LX0/n;->b(LX0/o;Lx7/a;)LX0/o;

    move-result-object p1

    return-object p1
.end method

.method public synthetic e(LX0/o;)LX0/o;
    .locals 0

    invoke-static {p0, p1}, LX0/n;->a(LX0/o;LX0/o;)LX0/o;

    move-result-object p1

    return-object p1
.end method

.method public f()Lo0/n0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
