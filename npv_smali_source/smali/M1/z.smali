.class public final LM1/z;
.super LM1/v;
.source "SourceFile"


# static fields
.field public static final b:LM1/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM1/z;

    invoke-direct {v0}, LM1/z;-><init>()V

    sput-object v0, LM1/z;->b:LM1/z;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LM1/v;-><init>(ILy7/k;)V

    return-void
.end method
