.class public final LS7/c;
.super LO7/n0;
.source "SourceFile"


# static fields
.field public static final c:LS7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS7/c;

    invoke-direct {v0}, LS7/c;-><init>()V

    sput-object v0, LS7/c;->c:LS7/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "protected_static"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, LO7/n0;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "protected/*protected static*/"

    return-object v0
.end method

.method public d()LO7/n0;
    .locals 1

    sget-object v0, LO7/m0$g;->c:LO7/m0$g;

    return-object v0
.end method
