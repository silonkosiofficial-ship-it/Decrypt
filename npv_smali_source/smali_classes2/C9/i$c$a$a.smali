.class public final LC9/i$c$a$a;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC9/i$c$a;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field synthetic F:Ljava/lang/Object;

.field G:I

.field final synthetic H:LC9/i$c$a;


# direct methods
.method public constructor <init>(LC9/i$c$a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LC9/i$c$a$a;->H:LC9/i$c$a;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LC9/i$c$a$a;->F:Ljava/lang/Object;

    iget p1, p0, LC9/i$c$a$a;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LC9/i$c$a$a;->G:I

    iget-object p1, p0, LC9/i$c$a$a;->H:LC9/i$c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LC9/i$c$a;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
