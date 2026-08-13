.class final LS8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS8/l;


# instance fields
.field private final a:Ljava/util/regex/Matcher;

.field private final b:Ljava/lang/CharSequence;

.field private final c:LS8/k;

.field private d:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V
    .locals 1

    const-string v0, "matcher"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS8/m;->a:Ljava/util/regex/Matcher;

    iput-object p2, p0, LS8/m;->b:Ljava/lang/CharSequence;

    new-instance p1, LS8/m$b;

    invoke-direct {p1, p0}, LS8/m$b;-><init>(LS8/m;)V

    iput-object p1, p0, LS8/m;->c:LS8/k;

    return-void
.end method

.method public static final synthetic e(LS8/m;)Ljava/util/regex/MatchResult;
    .locals 0

    invoke-direct {p0}, LS8/m;->f()Ljava/util/regex/MatchResult;

    move-result-object p0

    return-object p0
.end method

.method private final f()Ljava/util/regex/MatchResult;
    .locals 1

    iget-object v0, p0, LS8/m;->a:Ljava/util/regex/Matcher;

    return-object v0
.end method


# virtual methods
.method public a()LS8/l$b;
    .locals 1

    invoke-static {p0}, LS8/l$a;->a(LS8/l;)LS8/l$b;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1

    .prologue
    iget-object v0, p0, LS8/m;->d:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, LS8/m$a;

    invoke-direct {v0, p0}, LS8/m$a;-><init>(LS8/m;)V

    iput-object v0, p0, LS8/m;->d:Ljava/util/List;

    :cond_0
    iget-object v0, p0, LS8/m;->d:Ljava/util/List;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method public c()LS8/k;
    .locals 1

    iget-object v0, p0, LS8/m;->c:LS8/k;

    return-object v0
.end method

.method public d()LE7/i;
    .locals 1

    invoke-direct {p0}, LS8/m;->f()Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-static {v0}, LS8/p;->c(Ljava/util/regex/MatchResult;)LE7/i;

    move-result-object v0

    return-object v0
.end method

.method public next()LS8/l;
    .locals 3

    .prologue
    invoke-direct {p0}, LS8/m;->f()Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/regex/MatchResult;->end()I

    move-result v0

    invoke-direct {p0}, LS8/m;->f()Ljava/util/regex/MatchResult;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/regex/MatchResult;->end()I

    move-result v1

    invoke-direct {p0}, LS8/m;->f()Ljava/util/regex/MatchResult;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/regex/MatchResult;->start()I

    move-result v2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    iget-object v1, p0, LS8/m;->b:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-gt v0, v1, :cond_1

    iget-object v1, p0, LS8/m;->a:Ljava/util/regex/Matcher;

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->pattern()Ljava/util/regex/Pattern;

    move-result-object v1

    iget-object v2, p0, LS8/m;->b:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    const-string v2, "matcher(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LS8/m;->b:Ljava/lang/CharSequence;

    invoke-static {v1, v0, v2}, LS8/p;->a(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LS8/l;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method
