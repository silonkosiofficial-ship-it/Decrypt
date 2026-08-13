.class final LA/n$e;
.super LA/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# static fields
.field public static final e:LA/n$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA/n$e;

    invoke-direct {v0}, LA/n$e;-><init>()V

    sput-object v0, LA/n$e;->e:LA/n$e;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LA/n;-><init>(Ly7/k;)V

    return-void
.end method


# virtual methods
.method public a(ILY0/v;LD0/X;I)I
    .locals 0

    .prologue
    sget-object p3, LY0/v;->C:LY0/v;

    if-ne p2, p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1
.end method
