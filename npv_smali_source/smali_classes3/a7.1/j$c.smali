.class public final La7/j$c;
.super La7/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La7/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:La7/j$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La7/j$c;

    invoke-direct {v0}, La7/j$c;-><init>()V

    sput-object v0, La7/j$c;->a:La7/j$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La7/j;-><init>(Ly7/k;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, La7/j$c;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x39b082c9

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Last"

    return-object v0
.end method
