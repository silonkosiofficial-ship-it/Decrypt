.class public final Lcom/google/firebase/sessions/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/sessions/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/sessions/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/firebase/sessions/c;
    .locals 2

    sget-object v0, LQ4/c;->a:LQ4/c;

    invoke-static {v0}, LQ4/n;->a(LQ4/c;)LQ4/f;

    move-result-object v0

    const-class v1, Lcom/google/firebase/sessions/c;

    invoke-virtual {v0, v1}, LQ4/f;->j(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Firebase.app[SessionGenerator::class.java]"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/firebase/sessions/c;

    return-object v0
.end method
