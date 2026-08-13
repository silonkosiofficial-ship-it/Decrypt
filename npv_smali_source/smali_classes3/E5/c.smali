.class public final synthetic LE5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF5/b;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE5/c;->a:Landroid/content/Context;

    iput-object p2, p0, LE5/c;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LE5/c;->a:Landroid/content/Context;

    iget-object v1, p0, LE5/c;->b:Ljava/lang/String;

    invoke-static {v0, v1}, LE5/f;->c(Landroid/content/Context;Ljava/lang/String;)LE5/k;

    move-result-object v0

    return-object v0
.end method
