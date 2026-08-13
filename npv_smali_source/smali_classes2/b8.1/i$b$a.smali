.class public final Lb8/i$b$a;
.super Lb8/i$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/i$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LO7/e;


# direct methods
.method public constructor <init>(LO7/e;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb8/i$b;-><init>(Ly7/k;)V

    iput-object p1, p0, Lb8/i$b$a;->a:LO7/e;

    return-void
.end method


# virtual methods
.method public final a()LO7/e;
    .locals 1

    iget-object v0, p0, Lb8/i$b$a;->a:LO7/e;

    return-object v0
.end method
