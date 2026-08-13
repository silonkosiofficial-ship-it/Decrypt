.class final LM1/j$d$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/j$d$d;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final C:LM1/j$d$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM1/j$d$d$a;

    invoke-direct {v0}, LM1/j$d$d$a;-><init>()V

    sput-object v0, LM1/j$d$d$a;->C:LM1/j$d$d$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li7/M;

    invoke-virtual {p0, p1, p2}, LM1/j$d$d$a;->b(Li7/M;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Li7/M;Lm7/e;)Ljava/lang/Object;
    .locals 0

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
