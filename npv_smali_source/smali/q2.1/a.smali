.class final Lq2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/i$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq2/a$a;
    }
.end annotation


# static fields
.field public static final D:Lq2/a$a;


# instance fields
.field private final C:Lq2/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq2/a$a;-><init>(Ly7/k;)V

    sput-object v0, Lq2/a;->D:Lq2/a$a;

    return-void
.end method

.method public constructor <init>(Lq2/i;)V
    .locals 1

    const-string v0, "connectionWrapper"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/a;->C:Lq2/i;

    return-void
.end method


# virtual methods
.method public D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lm7/i$b$a;->a(Lm7/i$b;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a()Lq2/i;
    .locals 1

    iget-object v0, p0, Lq2/a;->C:Lq2/i;

    return-object v0
.end method

.method public getKey()Lm7/i$c;
    .locals 1

    sget-object v0, Lq2/a;->D:Lq2/a$a;

    return-object v0
.end method

.method public i(Lm7/i$c;)Lm7/i$b;
    .locals 0

    invoke-static {p0, p1}, Lm7/i$b$a;->b(Lm7/i$b;Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    return-object p1
.end method

.method public o0(Lm7/i;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, Lm7/i$b$a;->d(Lm7/i$b;Lm7/i;)Lm7/i;

    move-result-object p1

    return-object p1
.end method

.method public y0(Lm7/i$c;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, Lm7/i$b$a;->c(Lm7/i$b;Lm7/i$c;)Lm7/i;

    move-result-object p1

    return-object p1
.end method
