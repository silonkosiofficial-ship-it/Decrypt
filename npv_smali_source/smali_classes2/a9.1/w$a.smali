.class final synthetic La9/w$a;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final L:La9/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La9/w$a;

    invoke-direct {v0}, La9/w$a;-><init>()V

    sput-object v0, La9/w$a;->L:La9/w$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v5, 0x0

    const/4 v1, 0x3

    const-class v2, LZ8/g;

    const-string v3, "emit"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ly7/q;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, La9/w$a;->s(LZ8/g;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final s(LZ8/g;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p2, p3}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
