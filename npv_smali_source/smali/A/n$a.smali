.class final LA/n$a;
.super LA/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final e:LA/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA/n$a;

    invoke-direct {v0}, LA/n$a;-><init>()V

    sput-object v0, LA/n$a;->e:LA/n$a;

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

    div-int/lit8 p1, p1, 0x2

    return p1
.end method
