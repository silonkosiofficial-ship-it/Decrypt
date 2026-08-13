.class public final LM7/f$a;
.super LM7/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final e:LM7/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM7/f$a;

    invoke-direct {v0}, LM7/f$a;-><init>()V

    sput-object v0, LM7/f$a;->e:LM7/f$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    sget-object v0, LL7/j;->y:Ln8/c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "Function"

    invoke-direct {p0, v0, v3, v1, v2}, LM7/f;-><init>(Ln8/c;Ljava/lang/String;ZLn8/b;)V

    return-void
.end method
