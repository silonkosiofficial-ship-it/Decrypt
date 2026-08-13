.class public final LM9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH9/v;


# static fields
.field public static final a:LM9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM9/a;

    invoke-direct {v0}, LM9/a;-><init>()V

    sput-object v0, LM9/a;->a:LM9/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LH9/v$a;)LH9/B;
    .locals 10

    const-string v0, "chain"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LN9/g;

    invoke-virtual {p1}, LN9/g;->e()LM9/e;

    move-result-object v0

    invoke-virtual {v0, p1}, LM9/e;->v(LN9/g;)LM9/c;

    move-result-object v3

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, LN9/g;->d(LN9/g;ILM9/c;LH9/z;IIIILjava/lang/Object;)LN9/g;

    move-result-object v0

    invoke-virtual {p1}, LN9/g;->i()LH9/z;

    move-result-object p1

    invoke-virtual {v0, p1}, LN9/g;->a(LH9/z;)LH9/B;

    move-result-object p1

    return-object p1
.end method
